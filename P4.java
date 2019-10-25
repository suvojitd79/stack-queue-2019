public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        
        ArrayList<Integer> ans = new ArrayList();
        LinkedList<Integer> dq = new LinkedList();
        
        for(int i=0;i<A.size();i++){
            
            while(!dq.isEmpty() && dq.peekFirst() < i-B+1)
                dq.pollFirst();
                
            if(A.get(i) < 0)
                dq.addLast(i);
            
            if(B-1 <= i){
                
                if(dq.isEmpty())
                    ans.add(0);
                else
                    ans.add(A.get(dq.peekFirst()));
            }
        }
        return ans;
    }
    
}
