package practice.leetcode.String;

public class ValidParenthesis {
    static public boolean  isValid(String s) {
        int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
        for (int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch){
                case '(':num1++;break;
                case ')':num2++;break;
                case '[':num3++;break;
                case ']':num4++;break;
                case '{':num5++;break;
                case '}':num6++;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid(")(][}{"));
    }
}
