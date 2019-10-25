public class Solution {
    
    public String solve(String A) {

        char ans[] = new char[A.length()];
        LinkedList<Character> dq = new LinkedList();
        int[] count = new int[26];
        Arrays.fill(count, 0);
            
        for(int i=0;i<A.length();i++){
            
            Character c = A.charAt(i);
               
            count[c-'a']++;
            
            if(count[c-'a'] == 1) dq.addLast(c);   
            
            while(!dq.isEmpty() && count[dq.peekFirst()-'a'] > 1) dq.pollFirst(); 
            
            if(dq.isEmpty()) ans[i] = '#';
            else ans[i] = dq.peekFirst(); 
        }    
        return new String(ans);    
    }
    
    
}
