import java.util.Scanner;

public class NewYearChaos {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        minimumBribes(new int[]{1,2,5,3,7,8,6,4});
    }

    static void minimumBribes(int[] q) {
        int numberOfBribes = 0;
        for(int i=q.length-1; i >=0; i--){
            if(q[i] - (i+1) > 2){
                System.out.println("Too chaotic");
                return;
            }

            for(int j=Math.max(0, q[i]-2); j < i; j++){
                if(q[j] > q[i])
                    numberOfBribes++;
            }

        }
        System.out.println(numberOfBribes);
    }
}
