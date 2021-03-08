import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int rotate = 4;

        System.out.println(Arrays.toString(rotLeft(a, rotate)));

    }


    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];

        for(int i=0; i < a.length; i++){
            int place = i - d;
            if(i < d)
                place = i - d + a.length;

            b[place] = a[i];

        }
        return b;
    }

}
