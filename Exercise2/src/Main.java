
public class Main {

	public static void main(String[] args) {
		
		Badminton a = new Badminton();
		Yonex b = new Yonex();
		Lining c = new Lining();
		
		a.printTopic();
		System.out.println("");
		System.out.println(a.Class);
		System.out.println(a.Attribute);
		System.out.println(a.behaviour);
		
		System.out.println("");
		System.out.println(a.brand + b.brand);
		System.out.println(a.weight + b.weight);
		System.out.println(a.colour + b.colour);
		
		System.out.println("");
		System.out.println(a.brand + c.brand);
		System.out.println(a.weight + c.weight);
		System.out.println(a.colour + c.colour);
		


	}

}
