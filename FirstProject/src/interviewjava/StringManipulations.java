package interviewjava;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="The rains have started here";
		int c= str.length();//size is for ArrayList or List Object
		System.out.println("length of string is "+c);
		System.out.println(str.charAt(4));
		
		//indexOf is usedto get indexof specific character
		System.out.println(str.indexOf('a'));
		
		//substring is used to get substring from main string
		System.out.println(str.substring(4, 9));
		
		//trim is used for before space and after space
		String str1="     hello world   ";
		System.out.println(str1.trim());
		
		//replace is used to remove between space
		String str2="java selenium android";
		System.out.println(str2.replace(" ", ""));
		
		//replace all is used to remove specialcharcters
		String str3="@#$%^&Hello#$^%&*";
		System.out.println(str3.replaceAll("[^a-zA-Z0-9]",""));
		
		//split
		String str4="selenium_tutorial";
		 String st[]=str4.split("_");
		 System.out.println(st[0]+"\n"+st[1]);
		 
		 //concatnate
		 
		 String str5="care";
		 System.out.println(str5.concat("s"));
		
		
		

	}

}
