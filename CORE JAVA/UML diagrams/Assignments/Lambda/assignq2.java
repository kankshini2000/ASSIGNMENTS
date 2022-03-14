package lamda;
interface prod{
	int price(int a);
}
public class assignq2 {
	public static void main(String[] args) {
		prod p1=(a)->{
			return a;
		};
		if(p1.price(10000)>100) {
			System.out.println("order placed is greater than: "+p1.price(10000));
		}
		prod p2=new prod() {
			public int price(int a) {
				return a;
			}
		};
		if(p2.price(10000)>100) {
			System.out.println("ACCEPTED!");
		}
		else {
			System.out.println("COMPLETED!");
		}
		}
}
