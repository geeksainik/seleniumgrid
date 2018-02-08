package interviewjava;

public class Missing_number_in_Sequence_Array {

	public static void main(String[] args) {

	int seq[]= {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16};
	
	int len=seq.length;
	int sum=0;
	
	for(int i=0;i<len;i++ )
	{
		sum=sum+seq[i];
	}
	System.out.println("sum of Array::"+sum);
	
	int sum1=0;
	
	for(int j=1;j<=16;j++)
	{
		sum1=sum1+j;
	}
    System.out.println("sum of Original Sequence::"+sum1);
    System.out.println("Missing number in the sequence is::"+(sum1-sum));
	}
}

