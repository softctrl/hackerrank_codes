import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static class HourGlass implements Comparable<HourGlass>{
		int[] values = new int[7];
        int sum = 0;
		public HourGlass(final int[][] values, int x, int y) {
            this(getHourGlass(values, x, y));
		}

        public HourGlass(final int[] values) {
            this.values = values;
            this.sum = sum();
		}

        private int sum() {
			int s = 0;
			for (int v : values) s += v;
			return s;
		}
		@Override public int compareTo(HourGlass o) {
			return (this.sum == o.sum ? 0 : (this.sum < o.sum ? 1 : -1));// invert
		}

        public static int[] getHourGlass(final int[][] values, int x, int y) {
            return new int[]{values[x][y],   values[x][y+1], values[x][y+2],
                                    values[x+1][y+1],
                    values[x+2][y], values[x+2][y+1], values[x+2][y+2]};		
        }   
        
        @Override public String toString() {
            return String.format("%d %d %d%n  %d%n%d %d %d%n", values[0], 
                                                               values[1], 
                                                               values[2],
                                                               values[3],
                                                               values[4],
                                                               values[5],
                                                               values[6]);
        }
        
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<HourGlass> _values = new ArrayList<HourGlass>();
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int x=0; x < 4; x++) {
            for (int y=0; y < 4; y++) {
                _values.add(new HourGlass(arr, x, y));
            }
        }
        HourGlass[] values = _values.toArray(new HourGlass[]{});
        Arrays.sort(values);
        System.out.println(values[0].sum);
        
    }
}
