package practice.leetcode.Math;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n == 1)
            return true;
        else if (n > 1) {
            int prime = 2;
            while (n > 1) {
                if (n % prime == 0)
                    n = n / prime;
                else prime++;
                if (prime > 5)
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
    }
}
