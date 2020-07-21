import java.io.*; 
public class pascaltriangle { 
	static void printPascal(int n) 
	{ 
    	for (int l = 0; l < n; l++) 
    	{
	    	for (int i = 0; i <= l; i++) 
	    	System.out.print(binomialCoeff(l, i)+" "); 
	    	System.out.println(); 
    	} 
	} 
	static int binomialCoeff(int n, int k) 
	{ 
		int res = 1; 
		if (k > n - k) 
		k = n - k; 
		for (int i = 0; i < k; ++i) 
		{ 
			res *= (n - i); 
			res /= (i + 1); 
		} 
		return res; 
	} 
	public static void main(String args[]) 
	{ 
	    int n = 10; 
	    printPascal(n); 
	} 
} 
