import java.util.Scanner;

public class Assign_4 {
	
	public static void main(String[] args) {
		   
	    Scanner scan= new Scanner(System.in);
	    System.out.print("Enter the Number : ");
		long num = scan.nextLong();
		int counteven=0; 
		int countodd=0;
	    while(num<0 || num>0)
		{
			if ((num % 10) %2 == 0 )
		      counteven++;  
			else 
			  countodd++; 
			num=num/10;
		}
      	//System.out.println("Invalid number");
		System.out.print("Even digits : "+counteven +  " ; Odd digits: "+countodd);	
	}

}
