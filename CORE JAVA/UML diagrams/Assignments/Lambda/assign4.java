package lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class assign4 {
	public static void main(String[] args) {
		 List<String> lt = new ArrayList<>(Arrays.asList("pasta", "cake", "sushi", "maggi"));
		 lt.removeIf(word -> (word.length() % 2) != 0);
		 System.out.println(lt);
	}
}
