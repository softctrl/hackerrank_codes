import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int[] a, int i, int j){
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();scanner.nextLine();
        int[] a = new int[n];
        for (int idx=0; idx < n; idx++) {
            a[idx] = scanner.nextInt();
        }
        
        int numberOfSwaps = 0;        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, (j + 1));
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }        
        
        System.out.format("Array is sorted in %d swaps.%n", numberOfSwaps);
        System.out.format("First Element: %d%n", a[0]);
        System.out.format("Last Element: %d%n", a[n-1]);

    }
}
