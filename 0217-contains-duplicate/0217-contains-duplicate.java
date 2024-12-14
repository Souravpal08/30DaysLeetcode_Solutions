class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for(int  i=1; i<size; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}