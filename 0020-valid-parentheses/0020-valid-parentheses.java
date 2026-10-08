import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push matching closing brackets onto the stack when an opening bracket is found
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check if it matches the expected bracket at top of stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // Valid only if all opened brackets have been matched and popped
        return stack.isEmpty();
    }
}