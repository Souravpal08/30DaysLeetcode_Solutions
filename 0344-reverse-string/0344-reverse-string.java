class Solution {
    public void reverseString(char[] s) {
        //using two pinter from begining and last
        int left = 0, right = s.length - 1;
        while(left<right){
            //swapping values
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++ ;
            right --;
        }
        
    }
}