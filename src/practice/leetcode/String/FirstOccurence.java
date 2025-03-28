package practice.leetcode.String;

public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        int nc=needle.length(),hc=haystack.length();
        for (int i=0;i<hc-nc;i++){
            String req="";
            for (int j=i;j<nc+i;j++){
                req=req+haystack.charAt(j);
            }
            if (req.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","leeto"));
        System.out.println(strStr("hello","ll"));
    }
}
