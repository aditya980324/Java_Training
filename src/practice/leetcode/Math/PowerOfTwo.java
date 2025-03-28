package practice.leetcode.Math;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n==1)
            return true;
        else if (n%2!=0 || n<=0)
            return false;
           return isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(-30));
    }
}
