import java.util.Arrays;
import java.util.HashMap;

public class ArrayManipulation {
    public static void main(String[] args) {
        System.out.println(arrayManipulation(10, new int[][]{ {2,6,8}, {3,5,7}, {1,8,1}, {5,9,15} }));
    }

    static long arrayManipulation(int n, int[][] queries) {
        //n size of array
        long max = 0;
        HashMap<Integer, Long> indexes = new HashMap<>();

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            for(;a<b;a++){
                int index = a - 1;
                if(indexes.containsKey(index))
                    indexes.put(index, indexes.get(index)+k);
                else
                    indexes.put(index, (long) k);
                if(indexes.get(index) > max)
                    max = indexes.get(index);
            }
        }
        return max;
    }
}
