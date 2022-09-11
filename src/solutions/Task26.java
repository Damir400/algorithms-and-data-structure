package solutions;

public class Task26 {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = -101;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==-101 && nums[j]!=-101 && j<=nums.length-1){
                    nums[i]=nums[j];
                    nums[j]=-101;

                }
                if(i == nums.length-1 && nums[i]==-101){
                    nums[i]=-101;
                }

            }
        }
        int count = 0;
        for(int i : nums){
            if(i!=-101){
                count++;
            }
        }
        return count;
    }

    public void test() {
        int[] nums = new int[3];
        nums[0]=1;
        nums[1]=1;
        nums[2]=2;

        System.out.println(removeDuplicates(nums));
    }
}
