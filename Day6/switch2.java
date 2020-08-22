public class switch2 {
	
	//Properties of switch
	int size;
	int dimension;
	String shape;
	int weight;
	String material;
	
	// Construcutor
	public switch2(int s , String sh , int w) {
		size = s;
		shape = sh;
		weight = w;
	}
	
	public void display(){
		System.out.println("size :"+size);
		System.out.println("Shape :"+shape);
		System.out.println("Weight :"+weight);
		
	}
		
		public static void main(String[] args) {
			
			switch2 switchobj2 = new switch2(54, "circle", 75);
			switchobj2.display();
		}

	} 
	