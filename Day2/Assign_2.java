
public class Assign_2 {
	
	public static void main(String[] args) {
		
		float heightcm=heightConverter(6,4);
		System.out.println("Height in cm's :- "+heightcm+ " cm");
		
		float weightkg=weightConvertor(76);	    
		System.out.println("Weight in Pounds :- "+weightkg);
	}
	
	public static float heightConverter(int heightFeetPart, int heightInchPart) {
		float height1=(float) (heightFeetPart*12*2.54);
		float height2=(float) (heightInchPart*2.54);
		float heightcm=height1+height2;
		return heightcm;
	}
	
    public static float weightConvertor(int weight) {
    	float weightkg=(float) (weight*2.2);
    	return weightkg;
    	
    }
}
