class Solution {
    public int mySqrt(int x) {
        if (x==0 || x==1){
            return x; //handeling edge cases
        }
        int start = 1;
        int end = x;
        int result = 0;

        while(start <= end){
            //calculating middle
            int mid = start + (end - start)/2;

            //checking mid*mid = x
            if (mid <= x/mid){
                result = mid;
                start= mid +1;
            }else {
                end = mid -1;
            }
        }
        return result;
    }
}