class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findIndex(nums,target,true);
        int end = findIndex(nums, target, false);
        return new int [] {start, end};
        
    }
    static int findIndex(int[]arr, int target, boolean findfirst){
        int start=0;
        int end = arr.length-1;
        int pos = -1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
               pos = mid;
               if(findfirst) 
                  end = mid -1;
                else 
                   start = mid+1;
            } else if (arr[mid] < target) {
                start = mid + 1; // Target is in the right half
            } else {
                end = mid - 1; // Target is in the left half
            }
        }
        return pos;
           

    }
}