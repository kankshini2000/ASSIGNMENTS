package lamda;
interface air{
	int ope(int a,int b);
}
public class assignq1 {
	public static void main(String[] args) {  
		air add=new air() {
			public int ope(int a,int b) {
				return (a+b);
			}
		};
		System.out.println("Add: "+add.ope(13, 5));
		air sub=new air() {
			public int ope(int a,int b) {
				return (a-b);
			}
		};
		System.out.println("Sub: "+sub.ope(13, 5));
		air mul=new air() {
			public int ope(int a,int b) {
				return (a*b);
			}
		};
		System.out.println("Mul: "+mul.ope(13, 5));
		air div=new air() {
			public int ope(int a,int b) {
				return (a/b);
			}
		};
		System.out.println("Div: "+div.ope(13, 5));
	}
}
