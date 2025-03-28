package practice.leetcode.Math;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n==1)
            return true;
        while (n%4==0)
            n=n/4;
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
    }
}
