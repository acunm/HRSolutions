
public class CountingValleys {
    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";

        System.out.println(countingValleys(steps, path));

    }

    public static int countingValleys(int steps, String path) {
        int currentLevel = 0;
        int valleyCount = 0;
        boolean isDown = false;
        for(int i=0; i < steps;i++){
            if(path.charAt(i) == 'D') {
                currentLevel--;
                if(currentLevel < 0)
                    isDown = true;
            }
            else
                currentLevel++;

            if(isDown && currentLevel >= 0) {
                valleyCount++;
                isDown = false;
            }

        }
        return valleyCount;
    }

}
