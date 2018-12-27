import java.util.*;
public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        long level = 0, valleyNum = 0;
        boolean isEntered = false;
        for(int i = 0; i < n; i++) {
            if(steps[i] == 'U') {
                level ++;
            }
            if(steps[i] == 'D') {
                level --;
            }
            
            if(level < 0) {
                isEntered = true;
            }
            
            if(level == 0) {
                if(isEntered) {
                    valleyNum ++;
                    isEntered = false;
                }
            }
        }
        
        return valleyNum;
    }
}