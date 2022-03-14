package lamda;

import java.util.Arrays;
import java.util.List;

public class assign6 {
	public static void main(String[] args) {
		 List<String> lt = Arrays.asList("pasta", "cake", "sushi", "maggi");
		 lt.replaceAll(String::toUpperCase);
		 System.out.println(lt);
	}
}
