
 public class ConstructBirds {

     public static void main(String[] args) {
		
		System.out.println("Ostrich eats : ");
		Bird birdObj1 = new Ostrich();
		((Ostrich)birdObj1).eat("Insect");
		((Ostrich)birdObj1).eat();
		
		System.out.println("\nPenguin eats : ");
		Bird birdObj2  = new Pengiun();
		((Pengiun)birdObj2).eat("Fishes");
		((Pengiun)birdObj2).eat();
		
		
		System.out.println("\nParrot eats : ");
		Bird birdObj3 = new Parrot();
		((Parrot)birdObj3).eat("Seeds");
		((Parrot)birdObj3).eat();
				
	}
}
