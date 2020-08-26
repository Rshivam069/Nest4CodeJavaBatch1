
public abstract class Bird {
	
	// Properties of Bird class
	int height;
	int weight;
	String color;
	String species;
	
	public abstract void fly();
    public abstract void sound();
    public abstract void swim();
	
    public void eat() {
        System.out.println("This bird can eat.");
    }

    public void Layeggs() {
        System.out.println("This bird can lay eggs.");
    }

    

}

