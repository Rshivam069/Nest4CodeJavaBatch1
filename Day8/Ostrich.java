
public class Ostrich extends Bird{
	
    public void fly() {
      System.out.println("Ostrich can't flys!!!!");
    }
	
	public void sound() {
		System.out.println("Sound : Boom , low hum ");
	}
	
	public void swim() {
		System.out.println("Ostrich can swim !!!!");
	}	
	
	 // =============================================
	
	@Override
	public void eat(String item) {
		    System.out.println(item);
	 }
}
