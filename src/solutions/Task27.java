package solutions;

public class Task27 {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                nums[i]=-1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==-1 && nums[j]!=-1){
                    nums[i]=nums[j];
                    nums[j]=-1;
                }
                if(i == nums.length-1 && nums[i]==-1){
                    nums[i]=-1;
                }

            }
        }
        int count = 0;
        for(int i : nums){
            if(i!=-1){
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
        int val = 1;
        System.out.println(removeElement(nums,val));
    }
}
