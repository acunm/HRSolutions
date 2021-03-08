import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int []a = {4,3,1,2};
        System.out.println(minimumSwaps(a));
    }
    static int minimumSwaps(int[] arr) {

        int n = arr.length;

        ArrayList<Pair<Integer, Integer>> arrpos = new ArrayList<>();
        for(int i=0; i < n; i++){
            arrpos.add(new Pair<>(arr[i], i));
        }

        arrpos.sort((o1, o2) -> {
            if(o1.getKey() > o2.getKey())
                return -1;
            else if(o1.getKey().equals(o2.getKey()))
                return 0;
            return 1;
        });

        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);

        int ans = 0;

        for(int i=0; i < n; i++){
            if(vis[i] || arrpos.get(i).getValue() == i)
                continue;
            int cycleSize = 0;
            int j = i;
            while(!vis[j]){
                vis[j] = true;
                j = arrpos.get(j).getValue();
                cycleSize++;
            }

            if(cycleSize > 0)
                ans += (cycleSize - 1);

        }
        return ans;
    }
}
