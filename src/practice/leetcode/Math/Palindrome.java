package practice.leetcode.Math;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int rev=0;
        while(x>0){
            int num=x%10;
            rev=rev*10+num;
            x=x/10;
        }
        if(rev==x)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number - ");
        int num=sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
