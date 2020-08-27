
 public class ConstructBirds {

     public static void main(String[] args) {
		
		System.out.println("Ostrich eats : ");
		Bird birdObj1 = new Ostrich();
		((Ostrich)birdObj1).eat("Insect");
		Bird birdObj2 = new Ostrich();
		((Ostrich)birdObj2).eat();
		
		System.out.println("\nPenguin eats : ");
		Bird birdObj3  = new Pengiun();
		((Pengiun)birdObj3).eat("Fishes");
		Bird birdObj4 = new Pengiun();
		((Pengiun)birdObj4).eat();
		
		
		System.out.println("\nParrot eats : ");
		Bird birdObj5 = new Parrot();
		((Parrot)birdObj5).eat("Seeds");
		Bird birdObj6 = new Parrot();
		((Parrot)birdObj6).eat();
				
	}
}
