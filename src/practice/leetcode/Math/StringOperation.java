package practice.leetcode.Math;

public class StringOperation {
    public static boolean hasSameDigits(String s) {
        int n=s.length();
        while (n>2){
            String s2="";
            for(int j=0;j<=n-2;j++){
            int num=((s.charAt(j)-'0')+(s.charAt(j+1)-'0'))%10;
                s2=s2+num;
            }
            s=s2;
            n=s.length();
        }
        if(n==2)
            if(s.charAt(0)==s.charAt(1))
                return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
        System.out.println();
        System.out.println(hasSameDigits("34789"));
    }
}
