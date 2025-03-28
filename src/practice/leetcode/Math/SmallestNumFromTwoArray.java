package practice.leetcode.Math;

public class SmallestNumFromTwoArray {
    public static int minNumber(int[] nums1, int[] nums2) {
        int snums1=nums1[0],snums2=nums2[0];
        for (int i=1;i<nums1.length;i++){
            if (nums1[i]<snums1)
                snums1=nums1[i];
        }
        for (int i=1;i<nums2.length;i++) {
            if (nums2[i] < snums2)
                snums2 = nums2[i];
        }
        if (snums1==snums2)
            return snums1;
        else if (snums1<snums2)
            return snums1*10+snums2;
        else
            return snums2*10+snums1;
    }

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{4,1,3},new int[]{5,7}));
        System.out.println(minNumber(new int[]{3,5,2,6},new int[]{3,1,7}));
    }
}
