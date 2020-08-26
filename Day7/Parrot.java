public class Parrot extends Bird implements FLyBehavior{

    	@Override
        public void fly() {
          System.out.println("Parrot can flys !!!!");
        }
    	
    	public void sound() {
    		System.out.println("Sound : Squawk");
    	}
    		
    	public void swim() {
    		System.out.println("Parrot can't swim !!!!");
    		 
    	}
    }