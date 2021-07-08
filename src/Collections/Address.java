package Collections;
import java.util.*;
import java.util.stream.Collectors;
import java.time.Instant;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
public class Address {
	public static void main(String args[])
	{
//		User u1 = new User(4,"Vanessa");
//		User u2 = new User(3,"Albert");
//		User u3 = new User(1,"Tom");
	}
}
class User{
	private int id;
	private String name;
	TreeSet<Object> Address ;
	
	public User(int id, String name,TreeSet add) {
		super();
		this.id = id;
		this.name = name;
		this.Address= new TreeSet<Object>();
		this.Address=add;
	}
	@Override
	public String toString() {
		return id + " " + name ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class SortByUserID implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}

class SortByUserName implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}