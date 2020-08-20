import java.util.Scanner;

public class Assign_5 {
	
	public static void main(String[] args) {
		 Scanner n= new Scanner(System.in);
		 System.out.print("Enter the Number : ");
		 int num = n.nextInt();
		 int i,j;
 
		 for(i=1;i<=num;i++)
		 {
			 for(j=1;j<=i;j++)
		      {
				 System.out.print("*"); 
		      }
			 System.out.println("");
		 }
		 for(i=num-1;i>=1;i--)
		 {
			 for(j=1;j<=i;j++)
			 {
				 System.out.print("*"); 
		     }
			 System.out.println("");
		 }	
	}
}
