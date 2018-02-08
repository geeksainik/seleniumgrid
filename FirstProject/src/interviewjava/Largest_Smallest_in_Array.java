package interviewjava;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Smallest_in_Array {

	public static void main(String[] args) {
		
		//1.using defined Array
	
		
        int nums[]= {1,20,30,50,100,300,500,0};
		
		int smallest=nums[0];
		int largest=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>largest)
			{
				largest=nums[i];
			}
			else if(nums[i]<smallest)
			{
				smallest=nums[i];
			}
		}
		
		System.out.println("Taken Array is::"+ Arrays.toString(nums));
		System.out.println("Largest Element in Array is::"+largest+"\n"+"Smallest Element in Array is::"+smallest);
		System.out.println("**********END OF DEFINED ARRAY************");
		
          //Using runtime Array
		//Time Complexity will be O(n)
		
		System.out.println("Enter Array count"+"\n");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int numbs[]=new int[count];
		
		try {
			
		
		for(int j=0;j<count;j++)
		{
			System.out.println("Enter Array element");
			numbs[j]=sc.nextInt();
			
			
		}
		
		int small=numbs[0];
		int large=numbs[0];
		for(int i=0;i<numbs.length;i++)
		{
			if(numbs[i]>large)
			{
				large=numbs[i];
			}
			else if(numbs[i]<small)
			{
				small=numbs[i];
			}
		}
		
		System.out.println("Taken Array is::"+ Arrays.toString(numbs));
		System.out.println("Largest Element in Array is::"+large+"\n"+"Smallest Element in Array is::"+small);
		
	
		
		}catch(Exception e) {
		if(count==0)
		{
			System.out.println("Invalid Array size");
		}
		}
	}

}
