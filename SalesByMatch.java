import java.util.HashMap;
import java.util.Scanner;

public class SalesByMatch {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int pile = 9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(pile, socks));

    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int counter = 0;
        for(int i=0; i < n; i++){
            if(map1.containsKey(ar[i])){
                int val = map1.get(ar[i]) + 1;
                map1.put(ar[i], val);

                if(val == 2){
                    counter++;
                    map1.remove(ar[i]);
                }

            }else{
                map1.put(ar[i], 1);
            }
        }
        return counter;
    }

}
