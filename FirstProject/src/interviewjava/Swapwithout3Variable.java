package interviewjava;

public class Swapwithout3Variable {

	public static void main(String[] args) {
		
		int a=100;
		int b=700;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a:"+ a +"value of b:" +b);

	}

}
