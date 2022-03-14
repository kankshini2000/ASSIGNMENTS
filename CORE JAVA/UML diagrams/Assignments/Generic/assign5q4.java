package generic;
import java.util.Date;
class Pair<K,V>{
	K key;
	V value;
	K key1;
	V Date;
	public K getKey1() {
		return key1;
	}
	public void setKey1(K key1) {
		this.key1 = key1;
	}
	public V getDate() {
		return Date;
	}
	public void setDate(java.util.Date d1) {
		this.Date = (V) d1;
	}
	public void display1() {
		System.out.println("the key is : "+ key1 + " value pair is : "+Date);
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public void display() {
		System.out.println("the key is : "+ key + " value pair is : "+value);
	}
}
public class assign5q4 {
	public static void main(String[] args) {
		Pair<String,String> myObj=new Pair();
		myObj.setKey("1");
		myObj.setValue("hello");
		myObj.display();
		
		myObj.setKey1("Today is");
		Date d1 = new Date();
		myObj.setDate(d1);
		myObj.display1();
	}
}
