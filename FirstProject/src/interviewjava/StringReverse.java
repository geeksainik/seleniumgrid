package interviewjava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		//Reverse using for Loop
		System.out.println("Enter a word to reverse");
      Scanner sc= new Scanner(System.in);
         String s=sc.nextLine();
		
          int len=s.length();
          String rev="";
          for(int i=len-1;i>=0;i--)
          {
        	rev = rev + s.charAt(i);
          }
		
           System.out.println(rev);
        
        //Reverse using StringBuffer
           
          System.out.println("Enter a word to reverse");
   		
 	      Scanner scc= new Scanner(System.in);
           String st=sc.nextLine();
           StringBuffer sb= new StringBuffer(st);
           System.out.println(sb.reverse());
           
        
        
	}

}
