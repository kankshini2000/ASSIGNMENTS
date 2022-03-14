package lamda;

import java.util.Map;
import java.util.TreeMap;
public class assign7 {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new TreeMap<>();
	    m1.put("c", 3);
	    m1.put("b", 2);
	    m1.put("a", 1);
	    StringBuilder res = new StringBuilder();
	    m1.entrySet()
	      .forEach(word ->
	        res.append(word.getKey())
	          .append(word.getValue()));
	    System.out.println(res.toString());
	}
}
