import java.util.*;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        // the total of the previous 8 months
        int daysBefore = 0;

        //using Julian Calendar
        if(year >= 1700 && year <= 1917) {
            daysBefore = (year % 4 == 0) ? 244 : 243;
        }
        //transition period
        else if(year == 1918) {
            //Feb 14th was 32nd day of the year
            daysBefore = 243 - 13;
        }
        //using Gregorian Calendar
        else {
            daysBefore = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 244 : 243;
        }
        
        return (256 - daysBefore) + ".09." + year;
    }
}