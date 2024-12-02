// import java.util.*;
class Solution {
    public void swap(int[]a, int i,int j ){
        int temp = a[i];
        a[i]=a[j];
        a[j]= temp;

    }
    public int removeElement(int[] nums, int val) {
        int pointer = nums.length-1;
        int i=0;
        while(i <= pointer){
            if(nums[i]==val){
                swap(nums, i, pointer);
                    pointer --;
            } else {
                i++;
            }
        }
        return i;
        
    }
}