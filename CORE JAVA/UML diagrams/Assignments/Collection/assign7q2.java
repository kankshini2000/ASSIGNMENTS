import java.util.HashSet;
import java.util.Objects;
class product{
	String name;
	int price;
	public product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	
	public String toString(){
        return "name: "+name+"  price: "+price;
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
    
}
 public class assign7q2 {
	public static void main(String[] args) {
		HashSet<product> pr = new HashSet<product>();
        pr.add(new product("Banana", 20));
        pr.add(new product("Apple", 40));
        pr.add(new product("Orange", 30));
        for(product prt:pr){
            System.out.println(prt);
        }
        product duplicate = new product("Banana", 20);
        System.out.println("inserting duplicate object...");
        pr.add(duplicate);
        System.out.println("After insertion:");
        for(product prt:pr){
            System.out.println(prt);
        }
	}
}
