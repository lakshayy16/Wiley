package Collections;
import java.util.*;
import java.util.stream.Collectors;
import java.time.Instant;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
//set = [2,1, User{2,"User2"},User{1,"Adam"},Hi,Hello]

//integers
//users
//strings

//case 1: sort : show the integers first then users sorted by user id then strings

//expected sort : 1,2,User{1,"Adam"}, User{2,"User2"} (user by id),Hello,Hi

//case 2: sort : show me sorted strings then users sorted by user id then integers

//expected sort : Hello,Hi, User{1, "Adam"}, User{2,"User2"},1,2

//case 3: sort : show all the objects sorted based on string whether that is username or simple string then integers

//expected sort : User{1,"Adam"},Hello,Hi,User{2,"User2"},1,2
public class Set {
	public static void main(String[] args) {
		User u1 = new User(4,"Vanessa");
		User u2 = new User(3,"Albert");
		User u3 = new User(1,"Tom");
		//Case 1
		//TreeSet<Object> hash = new TreeSet<Object>(new SortByIntUserIDString());
		//Case 2
//		Set<Object> hash = new TreeSet<Object>(new SortByStringUserIDInt());
		//Case 3
		TreeSet<Object> hash = new TreeSet<Object>(new SortByStringInt());
		
		hash.add(u1);
		hash.add(u2);
		hash.add(u3);
		hash.add(new Integer(2));
		hash.add(new Integer(1));
		hash.add(new Integer(4));
		hash.add(new String("London"));
		hash.add(new String("Paris"));
		hash.add(new String("NewYork"));
		System.out.println(hash);
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

class SortByStringInt implements Comparator<Object>{
	@Override
	public int compare(Object o1,Object o2) {
		if(o1 instanceof String){
			if(o2 instanceof String)
				return o1.toString().compareTo(o2.toString());
			else if(o2 instanceof User)
				return o1.toString().compareTo(((User) o2).getName());
			else
				return -1;
		}
		else if(o1 instanceof User) {
			if(o2 instanceof User)
				return new SortByUserName().compare((User)o1,(User)o2);
			else
				return -1;
		}
		else if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2; 
			else
				return 1;
			
		}
		return 0;
	}
}

class SortByIntUserIDString implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) { // Comparing the type of both objects
		// TODO Auto-generated method stub
		if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2; // if both integer , then casting and returning the greater value 
			else
				return -1;
		}
		else if(o1 instanceof User) {
			if(o2 instanceof User)
				return new SortByUserID().compare((User)o1,(User)o2);
			else
				return -1;
		}
		else if(o1 instanceof String){
			if(o2 instanceof String)
				return o1.toString().compareTo(o2.toString());
			else
				return 1;
		}
		return 0;
	}
	
}

class SortByStringUserIDInt implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof String){
			if(o2 instanceof String)
				return o1.toString().compareTo(o2.toString());
			else
				return -1;
		}
		else if(o1 instanceof User) {
			if(o2 instanceof User)
				return new SortByUserID().compare((User)o1,(User)o2);
			else
				return -1;
		}
		else if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2;
			else
				return 1;
		}
		return 0;
	}
	
}

class SortByGlobalString implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2;
			else
				return 1;
		}
//---------------------------------------------------------------
//		else if(o2 instanceof Integer) {
//			if(o1 instanceof Integer)
//				return (int)o1-(int)o2;
//		}
//---------------------------------------------------------------
		else if(o1 instanceof String){
			if(o2 instanceof String)
				return ((String)o1).compareTo((String)o2);
			else if(o2 instanceof User)
				return new SortByString().compare(o1, o2);
			else
				return -1;
		}
//---------------------------------------------------------------
//		else if(o2 instanceof String){
//			if(o1 instanceof String)
//				return ((String)o1).compareTo((String)o2);
//			else if(o1 instanceof User)
//				return new SortByString().compare(o2, o1);
//			else
//				return -1;
//		}
//---------------------------------------------------------------
		else if(o1 instanceof User) {
			if(o2 instanceof User)
				return new SortByUserName().compare((User)o1, (User)o2);
			else if(o2 instanceof String)
				return new SortByString().compare(o1, o2);
			else
				return -1;
		}
//---------------------------------------------------------------
//		else if(o2 instanceof User) {
//			if(o1 instanceof User)
//				return new SortByUserName().compare((User)o1, (User)o2);
//			else if(o1 instanceof String)
//				return new SortByString().compare(o2, o1);
//			else
//				return -1;
//		}
//---------------------------------------------------------------
		return 0;
	}
	
}

class SortByUserID implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}


class SortByString implements Comparator<Object>{
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if(o1 instanceof User) {
        	if(o2 instanceof String)
        		return ((User) o1).getName().compareTo((String) o2);
        }
        else if(o1 instanceof String) {
        	if(o2 instanceof User)
        		return ((String) o1).compareTo(((User) o2).getName());
        }
        return 0;
    }
}

class SortByUserName implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}