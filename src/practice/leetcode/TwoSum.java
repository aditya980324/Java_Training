package practice.leetcode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i, j};
                break;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9));
        System.out.println(twoSum(new int[]{3,2,4},6));
        System.out.println(twoSum(new int[]{3,3},6));
    }
}
