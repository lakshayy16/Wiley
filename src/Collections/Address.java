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
		
	}
}
class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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