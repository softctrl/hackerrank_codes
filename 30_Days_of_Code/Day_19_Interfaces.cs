using System;
public interface AdvancedArithmetic{
    int divisorSum(int n);
}

//Write your code here
class Calculator : AdvancedArithmetic {

    int AdvancedArithmetic.divisorSum(int n) {
        int s = n;
        for (int d=1; d < n; d++) {
            if (n % d == 0) s += d;
        }
        return s;
    }

}

class Solution{
    static void Main(string[] args){
        int n = Int32.Parse(Console.ReadLine());
      	AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        Console.WriteLine("I implemented: AdvancedArithmetic\n" + sum); 
    }
}
