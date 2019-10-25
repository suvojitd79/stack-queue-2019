public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        
        
        int ans = 0;
        
        int i = 0, j = A.size()-1;
        
        int left_max = 0, right_max = 0;
        
        
        while(i<=j){
            
            if(A.get(i) < A.get(j)){
                
                if(A.get(i) > left_max)
                    left_max = A.get(i);
                else
                    ans += left_max - A.get(i);
                i++;    
                
            }else{
                
                if(A.get(j) > right_max)
                    right_max = A.get(j);
                else
                    ans += right_max - A.get(j);
                j--;
                
            }
            
            
        }
        
            
        return ans;
    }
    
    
}
