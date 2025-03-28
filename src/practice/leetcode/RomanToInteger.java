package practice.leetcode;

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum=0;char ch2 = 'A';
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if (i>0)
                ch2=s.charAt(i-1);
            String com;
            com=""+ch2+ch1;
            switch(ch1){
                case 'I':sum=sum+1;break;
                case 'V':sum=sum+5;break;
                case 'X':sum=sum+10;break;
                case 'L':sum=sum+50;break;
                case 'C':sum=sum+100;break;
                case 'D':sum=sum+500;break;
                case 'M':sum=sum+1000;
            }
            switch(com){
                case "IV":sum=(sum-6)+4;break;
                case "IX":sum=(sum-11)+9;break;
                case "XL":sum=(sum-60)+40;break;
                case "XC":sum=(sum-110)+90;break;
                case "CD":sum=(sum-600)+400;break;
                case "CM":sum=(sum-1100)+900;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
