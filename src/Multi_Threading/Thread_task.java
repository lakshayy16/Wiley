package Multi_Threading;

import java.util.*;

public class Thread_task {

    public static void main(String[] args) {
    	taskone tone=new taskone();
    	Thread t1=new Thread(tone);
        t1.start();
        
        tasktwo ttwo=new tasktwo(tone.integer);
        Thread t2=new Thread(ttwo);
        t2.start();
     
    }
}

class taskone implements Runnable{
	
	List<Integer> integer=new ArrayList<>();
	int n1=0,n2=1,n3,i,count=10;
	
	@Override
	public void run() {		
		integer.add(n1);
		integer.add(n2);
		 for(i=2;i<count;++i)  
		 {    
		  n3=n1+n2;     
		  integer.add(n3);
		  n1=n2;    
		  n2=n3;    
		 }  		
	}
	
	public List<Integer> getList(){
		 return integer;
	 }
}

class tasktwo implements Runnable{
	
	List<Integer> list=new ArrayList<>();
	int count=1;
	tasktwo(List<Integer> list)
	{
		this.list=list;
	}
		
	@Override
	public void run() {
		for(int i=0;i<list.size()-1;i++)
		{
			count=count+list.get(i);
			System.out.print(list.get(i)+"+"+list.get(i+1)+"="+count+"\n");	
		}	
		
	}	
}