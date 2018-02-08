package firstpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args) {

		String s="My Name is so and i have so because i have so";
		String s1[]=(s.split("so"));
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
	
		}
	
	
	
	
		String s2="bbaaccaa";
		String arr1[]= s2.split("a", -1);							
		String arr2[]= s2.split("a", 0);
		System.out.println(Arrays.asList(arr1).toString());
		System.out.println(Arrays.asList(arr2).toString());
		
		
		
		
		
	}

}
