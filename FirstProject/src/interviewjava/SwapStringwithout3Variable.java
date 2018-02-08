package interviewjava;

public class SwapStringwithout3Variable {

	public static void main(String[] args) {
		
	String a="selenium";
	String b="java";
	System.out.println("before swapping values"+"\n"+"a="+a+"\n"+"b="+b);
	System.out.println("After swapping values");
	a=a+b;//seleniumjava
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("\n"+"a="+a+"\n"+"b="+b);
	

	}

}
