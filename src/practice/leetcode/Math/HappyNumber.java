package practice.leetcode.Math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set s=new HashSet<>();
        while(n!=1){
            int sqrsum=0;
            s.add(n);
            while (n>0){
                int digit=n%10;
                sqrsum=sqrsum+digit*digit;
                n=n/10;
            }
            if (s.contains(sqrsum))
                return false;
            n=sqrsum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1));
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
