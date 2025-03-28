package practice.leetcode;

import java.util.Arrays;

public class ArrayToParity {
    public static int[] transformArray(int[] nums) {
        int n=nums.length,even=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
                even++;
        }
        for (int i=0;i<n;i++){
            if (i<even)
                arr[i]=0;
            else
            arr[i]=1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=transformArray(new int[]{4,3,2,1});
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }
}
