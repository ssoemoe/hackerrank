import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int total = 0, mult = 1;
        int lcmA = findLCM(a);
        int gcdB = findGCD(b);

        for(int i = lcmA, j = 2; i <= gcdB; i = lcmA * j, j++) {
            total += (gcdB % i == 0) ? 1 : 0;
        }

        return total;
    }

    static int gcd(int x, int y) {
        return (y == 0 ? x : gcd(y, x%y));
    }

    static int findGCD(int[] b) {
        int result = b[0];
        for(int i = 1; i < b.length; i++) {
            result = gcd(result, b[i]);
        }
        return result;
    } 

    static int lcm(int x, int y) {
        return x * (y / gcd(x , y));
    }

    static int findLCM(int[] a) {
        int result = a[0];
        for(int i = 1; i < a.length; i++) {
            result = lcm(result, a[i]);
        }
        return result;
    }
}
