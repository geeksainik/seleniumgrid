package interviewjava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement_in_Array {

	public static void main(String[] args) {
		
		//Using loops time complexity is O(nxn)
		
		String s[]= {"java","python","c","java","c","ruby",".net","selenium","java"};
		for(int i=0;i<s.length;i++)
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
					System.out.println("Dulpicate is::"+s[i]);
				
			}
		
		System.out.println("**********************************");
		//using Hashset timecomplexity is O(n)
		
		Set<String> store=new HashSet<String>();
		for(String name:s)
		{
			if(store.add(name)==false)
				System.out.println("Duplicate is::"+ name);
		}
		

	}

}
