package Collections;
import java.util.*;
import java.util.stream.Collectors;
public class Set {
	   public static void main(String args[]) {
		   TreeSet tset = new TreeSet();
		   //set<String> tset = new TreeSet<>(Comparator.reverseOrder()); 
		   tset.add("Hi");
		   tset.add("Hello");
		   tset.add("Hola");
		   tset.add("Buenos");
		   tset.add("Diaz");
		   //tset.add(null); - Does not allow null values 
		   tset.forEach(System.out::println);
		   
		   System.out.println("*****************");
		   HashSet test = new HashSet();
		   test.add("First");
		   test.add("2nd");
		   test.add("third");
		   test.add("4th");
		   test.add("fifth");
		   test.add("6th");
		   test.add("Seventh");
		   test.add("8th");
		   test.add(null);
		   test.forEach(System.out::println);
		   
		  System.out.println("*****************");

}
}
