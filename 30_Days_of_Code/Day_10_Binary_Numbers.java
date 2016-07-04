import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String[] b = Integer.toBinaryString(n).split("0");
        Arrays.sort(b);
        //System.out.println(Arrays.deepToString(b));
        System.out.println(b[b.length-1].length());
    }
}
