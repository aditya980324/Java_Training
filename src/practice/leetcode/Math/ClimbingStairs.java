package practice.leetcode.Math;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n<=3)
            return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(40));
        System.out.println(climbStairs(30));
        System.out.println(climbStairs(20));
        System.out.println(climbStairs(10));
    }
}
