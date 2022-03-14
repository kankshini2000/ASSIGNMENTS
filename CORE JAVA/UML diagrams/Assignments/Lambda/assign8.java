package lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class assign8 {
	public static void main(String[] args) {
		 new Thread(
			      () -> Arrays.asList(1, 2, 3, 4, 5)
			        .forEach(System.out::println))
			      .start();
		Consumer<List<Integer> >
        dispList = list -> list.forEach(a -> System.out.print(a + " "));        
    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(1);
    list.add(3);
    dispList.accept(list);
	}
}
