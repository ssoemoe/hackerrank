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

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
