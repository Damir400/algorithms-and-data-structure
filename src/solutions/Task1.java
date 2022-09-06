package solutions;

public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
//                    int[] result = new int[1];
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }


    public void test() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        int target = 6;
        int[] res = twoSum(nums,target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
