package Multi_Threading;
import java.util.concurrent.*;
public class CallableFuture {
	public static void main(String args[]) throws InterruptedException
	{
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;
		
		System.out.println("Starting");
		
		f=es.submit(new Sum(10));
		f2=es.submit(new Hypot(3,4));
		f3=es.submit(new Factorial(5));
		try {
			System.out.println(f.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		}catch(ExecutionException exc) {
			System.out.println(exc);
		}
		es.shutdown();
		System.out.println("Done");
	}
}
class Sum implements Callable<Integer>
{
	int stop;
	Sum(int v){
		this.stop=v;
	}
	@Override
	public Integer call(){
		int sum = 0;
		for(int i=0;i<=stop;i++)
		{
			sum+=i;
		}
		System.out.println("In Sum");
		return sum;
	}
	
}
class Hypot implements Callable<Double>
{
	double side1,side2;
	
	Hypot(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	public Double call(){
		System.out.println("In Hypot");
		return Math.sqrt((side1*side1 )+(side2*side2));
	}
	
}
class Factorial implements Callable<Integer>
{
	int stop;
	Factorial(int v){
		this.stop=v;
	}
	@Override
	public Integer call(){
		int fact = 1;
		for(int i=2;i<=stop;i++)
		{
			fact *=i;;
		}
		System.out.println("In Fact");
		return fact;
	}
	
}
