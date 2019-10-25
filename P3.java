public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        
        ArrayList<Integer> ans = new ArrayList();
        LinkedList<Integer> dq = new LinkedList();
        
        for(int i=0;i<A.size();i++){
            
            // remove the numbers out of the range B
            while(!dq.isEmpty() &&  dq.peekFirst() < i-B+1)
                dq.pollFirst();
            
            // remove smaller numbers
            while(!dq.isEmpty() && A.get(dq.peekLast()) < A.get(i))
                    dq.pollLast();
            
            dq.addLast(i);
            
            if(i >= B-1)
                ans.add(A.get(dq.peekFirst()));
            
        }
        return ans;
    }
    
}
