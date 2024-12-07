class Solution {
    public int myAtoi(String s) {
        //triming whitespaces
        s = s.trim();
        if(s.isEmpty()){
             return 0;
        }
        //determining the sign
        int sign = 1;
        int index = 0;
        if(s.charAt(0)== '-'|| s.charAt(0)== '+'){
            sign = (s.charAt(0)== '-') ? -1 : 1;
            index++;
        }
        //read digits and build number
        long result = 0;
        while(index<s.length() && Character.isDigit(s.charAt(index))){
            result = result * 10 +(s.charAt(index) - '0');
            if (result > Integer.MAX_VALUE) break;
            index ++;
        }
        //handeling overflow and apply sign
        result *= sign;
        if(result >Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;  

        return (int) result;
    }
}