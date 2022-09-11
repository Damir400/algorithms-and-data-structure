package solutions;

public class Task35 {
    public int searchInsert(int[] nums, int target) {
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]<target){
                position=i+1;
            }
            if(nums[i]>target){
                return position;
            }

        }
        return position;
    }

    public void test() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
}
