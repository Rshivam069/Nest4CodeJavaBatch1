public class switch1 {
	
	// Properties of switch
	int size;
	int dimension;
	String shape = "Rectangle";
	int weight;
	String material = "Plastic";
	
	// Behaviour of switch
	public void states(){
		System.out.println("ON or OFF");
	}
	
	public void speed() {
		System.out.println("SLow , Medium , Fast");
	}	
	
	public void display(){
		System.out.println("size :"+size);
		System.out.println("Shape :"+shape);
		System.out.println("Weight :"+weight);
		System.out.println("Material :"+material);		
	}
	
	public static void main(String[] args) {
		
		// Objects of switch
		switch1 switchobj1 = new switch1();
		switchobj1.material = "metal";
		switchobj1.weight = 10;
		switchobj1.states();
		switchobj1.size = 35;
		switchobj1.speed();
		switchobj1.display();		
	}

}
