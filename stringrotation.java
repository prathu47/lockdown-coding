import java.io.*;
public class stringrotation
{ 
	static boolean rotation(String str1, String str2) 
	{ 
		return (str1.length() == str2.length()) && 
			((str1 + str1).contains(str2)); 
	} 
	public static void main(String[] args) 
	{ 
		String str1 = "BBCD"; 
		String str2 = "BCDB"; 
		if (rotation(str1, str2)) 
			System.out.println("Yes"); 
		else
			System.out.printf("No"); 
	} 
} 
