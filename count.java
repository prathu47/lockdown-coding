public class count {
    public static void cntArray(int A[], int N) 
		    { 
		        
		        int result = 0; 
		  
		        for (int i = 0; i < N; i++) { 
		  
		            
		            result++; 
		  
		            
		            int current_value = A[i]; 
		  
		            for (int j = i + 1; j < N; j++) { 
		  
		                
		                if (A[j] == current_value) { 
		                    result++; 
		                } 
		            } 
		        } 
		  
		        
		        System.out.println(result); 
		    } 
		  
		     
		    public static void main(String[] args) 
		    { 
		        int[] A = { 1,2,1,5,2 }; 
		        int N = A.length; 
		        cntArray(A, N); 
		    } 
		 

	}
