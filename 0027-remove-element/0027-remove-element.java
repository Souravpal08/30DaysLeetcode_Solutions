// import java.util.*;
class Solution {
    public void swap(int[]a, int i,int j ){
        int temp = a[i];
        a[i]=a[j];
        a[j]= temp;

    }
    public int removeElement(int[] nums, int val) {
        //pointer starts at the last index of the array (nums.length - 1).
        int pointer = nums.length-1;
        int i=0;
        while(i <= pointer){
            if(nums[i]==val){
                //calling swap function for if val is matched with i
                swap(nums, i, pointer);
                    pointer --;
            } else {
                i++;
            }
        }
        return i;
        
    }
}
