package practice.leetcode.Math;

public class AddDigits {
    public static int addDigits(int num) {
        if(num%10==num)
            return num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
