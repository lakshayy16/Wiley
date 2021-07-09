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
		List<Add> Address = new ArrayList<>();
		
		Address.add(new Add("DEL",110001));
		Address.add(new Add("GN",201305));
		Address.add(new Add("BLR",560001));
		
		List<User> user = new ArrayList<>();
		user.add(new User(2, "User2", Arrays.asList(Address.get(1), Address.get(2))));
		user.add(new User(1, "User1", Arrays.asList(Address.get(0), Address.get(2))));
		user.add(new User(3, "User3", Arrays.asList(Address.get(0), Address.get(2))));
		
		System.out.println("[");
		Address.forEach(i->{
			List<User> temp = new ArrayList<>(user.stream().filter(a-> a.isCityExist(i.getCity())).toList());
			if(temp.size()>1) {
				System.out.print(" address { city: " + i.getCity()+
						" , zip:"+i.getZip()+
						" ,users: [");
				temp.stream().forEach(System.out::print);
				System.out.println("] },");
			}
		});
		System.out.println("]");

	}
}

class Add{
	String city;
	int zip;
	public Add(String city,int zip) {
		super();
		this.city=city;
		this.zip=zip;
	}
	@Override
	public String toString() {
		return("{ city: '" + city + "' , zip: "+zip+" }");
	}
	public String getCity() {
		return city;
	}
	public int getZip() {
		return zip;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setZip(int zip) {
		this.zip=zip;
	}
}
class User{
	int id;
	String name;
	List<Add> address ;
	
	public User(int id, String name,List<Add> address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}
	@Override
	public String toString() {
		return ("User{ id:"+ id+","+" name: '"+name+"'}, ");
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
	public List<Add> getAddress(){
		return address;
	}
	public void setAddress(List<Add> address) {
		this.address = address;
	}
	public boolean isCityExist(String city) {
		return address.stream().anyMatch(a->a.getCity().equals(city));
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