import java.util.HashMap;
import java.util.Map;

public class HashTablesIceCreamParlor {
    public static void main(String[] args) {
        whatFlavors(new int[]{1,4,5,3,2}, 4);
    }
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < cost.length; i++){
            int c = cost[i];
            if(c > money)
                continue;

            if(map.containsKey(money-c)){
                System.out.println((map.get(money-c)) + " " + (i+1));
                return;
            }

            map.put(c, i+1);
        }
    }
}