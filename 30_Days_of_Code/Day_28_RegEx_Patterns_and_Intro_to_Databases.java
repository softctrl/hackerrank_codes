import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> users = new ArrayList<String>();
        while (n-->0) {
            String[] row = scanner.nextLine().split(" ");
            if (row[1].matches("^.*@gmail.com$")) {
                users.add(row[0]);
            }
        }
        String[] _users = users.toArray(new String[]{});
        Arrays.sort(_users);
        for (String v : _users) System.out.println(v);
        scanner.close();
    }
}
