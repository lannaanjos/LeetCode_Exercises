class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r[]= {0,0};
        boolean verification = false;

        for(int i = 0; i <= nums.length-1; i++){
            for(int j = i+1; j <= nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    r[0] = i;
                    r[1] = j;
                    verification = true;
                    break;
                }
            }
            if(verification == true){
                break;
            }
        }

        return r;
    }
}