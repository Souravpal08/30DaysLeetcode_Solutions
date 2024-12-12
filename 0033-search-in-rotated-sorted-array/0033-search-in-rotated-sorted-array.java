class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1;

        if(nums.length == 0 ){
            return pos;
        }

        while(start <= end){
            //calculating mid
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            //finding in left half when it is sorted
            if(nums[start]<= nums[mid]){
               if(nums[start]<=target && target < nums[mid] ){
                  end = mid -1;
               }else{
                start = mid + 1;
               }
            }//finding in right half
            else{
                if(nums[mid]<=target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
           
        }
        return pos;

    }
}