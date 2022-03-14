import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class assign7q1 {

	public static void main(String[] args) {
		Contacts c1=new Contacts("neha","suno@gmail.com","F");
		Contacts c2=new Contacts("heha","dekh@gmail.com","F");
		Contacts c3=new Contacts("vihay","vih@gmail.com","M");
		phone p1=new phone(94567890L);
		phone p2=new phone(12345678L);
		phone p3=new phone(23456780L);
		Map<phone,Contacts> cmap=new TreeMap<>();
		cmap.put(p1, c1);
		cmap.put(p2, c2);
		cmap.put(p3, c3);
		Set<java.util.Map.Entry<phone,Contacts>> entryset=cmap.entrySet();
		Iterator<java.util.Map.Entry<phone, Contacts>> iterator=entryset.iterator();
		while(iterator.hasNext()) {
			java.util.Map.Entry<phone,Contacts> entry=(java.util.Map.Entry<phone,Contacts>) iterator.next();
			phone ph=entry.getKey();
			Contacts cont=entry.getValue();
			System.out.println(ph);
			System.out.println(cont);
			System.out.println("the phone no is:"+ph+"the details are:"+cont);
		}
	}
}
