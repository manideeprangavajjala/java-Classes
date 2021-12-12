package circle;

public class objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  	Atributes circle1= new Atributes();
		
		circle1.r = 3;
		circle1.c = 2*22/7*circle1.r;
		circle1.area = 22/7*circle1.r*circle1.r;
		
		
		System.out.println("Circumference = "+ circle1.c);
		
		System.out.println("Area = "+ circle1.area);

	}

}
