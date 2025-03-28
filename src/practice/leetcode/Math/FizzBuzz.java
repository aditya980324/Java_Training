package practice.leetcode.Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> lsr = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5==0)
                lsr.add("FizzBuzz");
            else if (i%3==0)
                lsr.add("Fizz");
            else if (i%5==0)
                lsr.add("Buzz");
            else
                lsr.add(""+i);
        }
        return lsr;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.