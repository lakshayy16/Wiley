package TestExample;

public class minSum {
	static int arr[] = {3,5,-6,-2,88,34,-26};
	public static void main(String[] args) 
	{
		
		int a=min();
		System.out.println(a);
	}
	
	static int min()
	{
		int min1=100;
		int min2=100;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				arr[i]=arr[i]*-1;
		}
		for(int i:arr)
		{
			if(i<min1)
				min1=i;
		}
		for(int i:arr)
		{
			if(i!=min1 && min2>i)
				min2=i;
		}
		return min1+min2;
	}

}
