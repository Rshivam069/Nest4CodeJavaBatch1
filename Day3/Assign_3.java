import java.util.Scanner;

public class Assign_3 {
	
	public static void main(String[] args) {
		   
	    Scanner scan= new Scanner(System.in);
	    System.out.print("Enter the String1 : ");
		String str1 = scan.next();
		System.out.print("Enter the String2 : ");
		String str2 = scan.next();
		int lenght1=str1.length(); 
		int lenght2=str2.length();
		String last2for2=str2.substring(lenght2-2, lenght2);
		String last2for1 =str1.substring(lenght1-2, lenght1);
		String first2for2= str2.substring(0,2);
		String first2for1=str1.substring(0,2);
		
		String result1=last2for2 + str1.substring(2,lenght1-2)+ first2for2;
		String result2=last2for1 + str2.substring(2,lenght1-2)+ first2for1;
		System.out.println("After exchanging String 1 : "+result1);
	 	System.out.println("After exchanging String 2 : "+result2);
	}

}
