package practice.leetcode;

public class TreeDivisor {
    public static boolean isThree(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if (count==2)
        return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isThree(2));
        System.out.println(isThree(4));
    }
}
