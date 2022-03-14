
public class inserts {

	public static void main(String[] args) {
		String s2="It is used to _ at the specified index position at the location denoted by the sign _ ";
		StringBuilder sb= new StringBuilder(s2);
		//int len=sb.length();
		//System.out.println(len);
		sb.replace(14, 15 ," ");
		sb.replace(84, 85 ," ");
		System.out.println(sb.insert(14, "insert text"));
		System.out.println(sb.insert(95, "insert text"));
	}
}
