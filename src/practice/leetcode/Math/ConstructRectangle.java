package practice.leetcode.Math;

import java.util.*;

/*
A web developer needs to know how to design a web page's size. So,
given a specific rectangular web page’s area, your job by now is to design a rectangular web page,
whose length L and width W satisfy the following requirements:

The area of the rectangular web page you designed must equal to the given target area.
The width W should not be larger than the length L, which means L >= W.
The difference between length L and width W should be as small as possible.
Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
 */
public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        ArrayList<int[]> set =new ArrayList<>();
        int L=area,W=1;
        while (L>=W){
            if (L*W==area){
                set.add( new int[]{L, W});
            }
            L--;W++;
        }
        int size=set.size();
        if(size==0)
            return new int[]{area,1};
            return set.get((size-1)/2);
    }
    public static void main(String[] args) {
        int[] result=constructRectangle(122122);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
