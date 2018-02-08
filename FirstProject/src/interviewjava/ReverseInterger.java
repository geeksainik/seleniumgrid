package interviewjava;

public class ReverseInterger {
	
	//to reverse an interger
	//1.using algorithm

	public static void main(String[] args) {
		
		int num=12345;
		int rev=0;
		while(num!=0)
		{
			
		rev=rev*10+num%10;
		num=num/10;
		
		}
System.out.println(rev);

   //2.using StringBuffer

     int number=567894;
     StringBuffer reverse=new StringBuffer(String.valueOf(number)).reverse();
     System.out.println(reverse);
	}

}
