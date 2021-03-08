public class RepeatedString {
    public static void main(String[] args) {
        String s = "a";
        long n = 1000000000000L;
        System.out.println(repeatedString(s,n));
    }

    static long repeatedString(String s, long n) {
        long aCount = 0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == 'a')
                aCount++;
        }

        if(aCount == 0)
            return 0;

        long count = n / s.length();
        aCount *= count;

        if(n - count == 0){
            return aCount;
        }

        String subS = s.substring(0, (int) (n - (count * s.length())));
        for(int i=0; i < subS.length(); i++){
            if(subS.charAt(i) == 'a')
                aCount++;
        }

        return aCount;
    }
}
