public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0,0,0,1,0,0};

        System.out.println(jumpingOnClouds(c));
    }


    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for(int i=0; i < c.length;){
            if(i+2 < c.length && c[i+2] != 1){
                i+=2;
            } else if(i+2 < c.length && c[i+2] == 1){
                i++;
            } else if(i+1 < c.length && c[i+1] == 1){
                i+=2;
            } else {
                i++;
                if(i >= c.length)
                    continue;
            }
            jumps++;
        }

        return jumps;
    }
}
