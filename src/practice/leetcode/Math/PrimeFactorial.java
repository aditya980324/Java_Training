package practice.leetcode.Math;

public class PrimeFactorial {
    public static void main(String[] args) {
        int num=7,fact=2;
        while (fact<=num){
            if (num%fact==0){
                System.out.print(" "+fact);
                num=num/fact;
            }
            else fact++;
        }
    }
}
