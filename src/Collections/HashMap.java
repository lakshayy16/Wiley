package Collections;
import static java.lang.System.out;
import java.util.*;
import java.util.Dictionary;

public class HashMap{

	public void execute()
	{
		Hashtable<String, String> ht = new Hashtable<>();
// No duplication allowed
/*Hashtable working
 * Features of Hashtable

*It is similar to HashMap, but is synchronized.
*Hashtable stores key/value pair in hash table.
*In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
* The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
*The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
*HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
		 */
		ht.put("1", "on");
		ht.put("0", "off");
		ht.put("3", "null");
		ht.put("4", "abc");
		//ht.put(null, "null");
		if(ht.containsKey("0"))
		{
			String h = ht.get("0");
			System.out.println("Value for 0 is:"+h);
		}
		
		System.out.println(ht);
		ht.put("3","not null");
		ht.remove("3");
		System.out.println(ht);
		
		//ht.entrySet().forEach(entry->out.println(entry.getKey())+"----"+entry.getValue());
		//UserKey u1 = new UserKey(id: "1",name:"User1");
		
        HashMap<UserKey,String> map = new HashMap<>();

		UserKey usr1 = new UserKey("1","User1");
        UserKey usr2 = new UserKey("1","User2");
        UserKey usr3 = new UserKey("2","User2");
        UserKey usr4 = new UserKey("3","User3");

        int hashCode1 = usr1.hashCode();
        int hashCode2 = usr2.hashCode();
        int hashCode3 = usr3.hashCode();
        int hashCode4 = usr4.hashCode();

        map.put(usr1,"Hola");
        map.put(usr2,"Hey");
        map.put(usr3,"Hello");
        map.put(usr4,"Wassup");


        map.entrySet().forEach(e-> out.println(e.getKey() +" -- " +e.getValue()));

        String val = map.get(new UserKey("1","User1"));

        out.println("VAL : "+val);
        out.println("HashCode  : "+hashCode1 +",  "+hashCode2 + ", "+hashCode3 + ", "+hashCode4);
        // allows one null key
        // allows multiple null values
        // is not thread safe
	}

}
class UserKey{
    String id;
    String name;

    public UserKey(String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        UserKey userKey = (UserKey)obj;

        return this.id.equals(userKey.id) && this.name.equals(userKey.name);
    }

    @Override
    public String toString() {
        return this.id +" "+this.name;
    }
}
