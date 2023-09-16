public class RunningSumof1darray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       Solution1 sol=new Solution1();
        int[] ret = sol.runningSum(nums);
        for (int i=0;i<ret.length;i++){
            System.out.print(ret[i]);
        }
    }
}
class Solution1 {
    public int[] runningSum(int[] nums) {
        int[] ret= new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ret[i]=getSum(nums,i);
        }
        return  ret;
    }

    private int getSum(int[] nums, int index) {
        int sum=0;
        for (int i=0;i<=index;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
}
