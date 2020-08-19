import java.util.Scanner;

public class Assign_3 {
	
	public static void main(String[] args) {
		   
	    Scanner scan= new Scanner(System.in);
	    System.out.print("Enter the String1 : ");
		String str1 = scan.next();
		System.out.print("Enter the String2 : ");
		String str2 = scan.next();
		int lenght1 = str1.length(); 
		int lenght2 = str2.length();
		String ending2for2 = str2.substring(lenght2-2, lenght2);
		String ending2for1 = str1.substring(lenght1-2, lenght1);
		String starting2for2 = str2.substring(0,2);
		String starting2for1 = str1.substring(0,2);
		
		String soln1 = ending2for2 + str1.substring(2,lenght1-2) + starting2for2 ;
		String soln2 = ending2for1 + str2.substring(2,lenght1-2) + starting2for1;
		System.out.println("After exchanging String 1 : "+soln1);
	 	System.out.println("After exchanging String 2 : "+soln2);
	}

}
