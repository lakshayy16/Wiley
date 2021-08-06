package TestExample;
import java.util.*;
public class knapsack {
	static int W = 50;
	static int sum=0;
	static int value=0;
	public static void main(String[] args) {
		int max=0;
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        
        int n = val.length;
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		sum+=wt[j];
        		if(sum<=W)
        		{
        		value+=val[j];
        		}
        	}
        	System.out.print(sum+" "+value+"----");
        	if(max<value)
        	{
        		max=value;
        		value=0;
        		sum=0;
        	}
        	sum=0;
        }
        System.out.println(max);
	}
	static void recknap(int n)
	{
		if(sum>W)
			return ;
		
	}

}
