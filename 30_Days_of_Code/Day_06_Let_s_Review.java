import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();scanner.nextLine();
        while ((t--)>0) {
            char[] chars = scanner.nextLine().toCharArray();
            int length = chars.length;
            for (int idx=0; idx<length; idx ++) {
                if ((idx %2) == 0) System.out.print(chars[idx]);
            }
            System.out.print(" ");
            for (int idx=0; idx<length; idx ++) {
                if ((idx %2) != 0) System.out.print(chars[idx]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
