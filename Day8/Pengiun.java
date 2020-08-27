
public class Pengiun extends Bird implements SwimBehavior{
	
	
    public void fly() {
      System.out.println("Penguin can't flys!!!!");
    }
	
	public void sound() {
		System.out.println("Sound : Gak ");
	}
	
	@Override
	public void swim() {
		System.out.println("Penguin can swim !!!!");
	} 
	
	//  ===========   ======   ========= ==========================
	
	@Override
	public void eat(String item) {
		   System.out.println(item);
	 }
	
}
