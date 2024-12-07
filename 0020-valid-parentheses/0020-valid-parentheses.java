class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <Character>();
        //taversing the whole input string
        for (char c:s.toCharArray()){
            //if the charecter is an opening brace then push it
            if( c == '(' || c == '{' || c== '['){
                stack.push(c);
            }else{
                //if char is a closing brace
                //if stack is empty, no matching brace
                if(stack.isEmpty()){
                    return false;
                }
                //get the top stack and matching it with the opening bracket
                char topChar = stack.peek();
            if ((c == ')' && topChar == '(') || (c == ']' && topChar == '[') || (c == '}' && topChar == '{')) {
                 stack.pop();
             } else{ //if braces dont match
                return false;
             }
     }
      
    }
    return stack.isEmpty();

    }
}
