public class Solution {
    public int longestValidParentheses(String A) {
        
        int ans = 0;
        LinkedList<Integer> stack = new LinkedList();
        stack.addLast(-1);
        
        for(int i=0;i<A.length();i++){
            
            if(A.charAt(i) == '(')
                stack.addLast(i);
            else{
                stack.pollLast();
                if(!stack.isEmpty())
                    ans = Math.max(ans, i - stack.peekLast());
                else
                    stack.addLast(i);
            }
            
        }
        return ans;
    }
}
