import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class basic1 {
	public static void main(String[] args) {
		String str1="A quick brown fox jumps over the lazy dog";
		String str[]= str1.split(" ");
		List<String>  MyList = (List<String>) Arrays.asList(str);
		 ArrayList<String> a1 = new ArrayList<String>(MyList);
		 for(int i=0; i<a1.size(); i++)
	        {
	            System.out.println(a1.get(i));
	        }
	}
}
