package practice.leetcode.Math;

public class Base7 {
    public static String convertToBase7(int num) {
        int i=1,con=0;
        if (num>=0) {
            while (num > 0) {
                int digit = num % 7;
                con=con*i+digit;
                i=10;
                num = num / 7;
            }
            return ""+con;
        }
        num=num*-1;
        while (num > 0) {
            int digit = num % 7;
            con=con*i+digit;
            i=10;
            num = num / 7;
        }
        return "-"+con;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
        System.out.println(convertToBase7(8));
        System.out.println(convertToBase7(-14));
    }
}
