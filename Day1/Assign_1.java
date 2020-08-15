
public class Assign_1 {

	public static void main(String[] args) {
		
		float item1=145;
		float item2=299;
		float item3=100;
		float sum=item1+item2+item3;
		float tax=15;
		float tax_amt=(tax/100)*sum;
		float final_amt=sum+tax_amt;
		System.out.println("Tax Amount is Rs."+tax_amt);
		System.out.println("Final Amount is Rs."+final_amt);
	}

}
