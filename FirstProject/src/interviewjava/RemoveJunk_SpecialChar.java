package interviewjava;

//To Remove special characters or junk symbols we can use regular expressions and replaceAll method
public class RemoveJunk_SpecialChar {

	public static void main(String[] args) {
		
		String s="&(%$%&())what are you doing@$%%%*";
		s=s.replaceAll("[^a-zA-Z0-9\\s]","");
		System.out.println(s);

	}

}
