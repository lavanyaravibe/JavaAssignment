package firstproject;

public class NumFreq {		  

	  static boolean isNumBalanced(int N) 
	    { 
	        String st = String.valueOf(N); 
	        boolean isBalanced = true; 

	        int[] freq = new int[10]; 
	        int i = 0; 
	        int n = st.length(); 
	  
	        for (i = 0; i < n; i++) 

	        	freq[st.charAt(i) - '0']++; 
	  
	        for (i = 0; i < 9; i++) { 
	  
	            if (freq[i] != freq[i + 1]) 
	                isBalanced = false; 
	        } 

	        if (isBalanced) 
	            return true; 
	        else
	            return false; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        //int N = 1234567890; 
	        int N = 1337;
	        boolean flag = isNumBalanced(N); 
	  
	        if (flag) 
	            System.out.println("YES"); 
	        else
	            System.out.println("NO"); 
	    } 
	} 