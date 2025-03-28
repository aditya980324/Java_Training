package practice.leetcode.Math;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        long count= (long) ((Math.sqrt(1+8*(long)n)-1)/2);
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(6));
        System.out.println(arrangeCoins(1804289383));
    }
}
