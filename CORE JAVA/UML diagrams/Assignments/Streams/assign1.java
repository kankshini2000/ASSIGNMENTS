import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class assign1 {
	public static void main(String[] args) {
		List <Fruits> f1=new ArrayList < Fruits > ();
		f1.add(new Fruits("apple",103,40,"red"));
		f1.add(new Fruits("pear",114,50,"green"));
		f1.add(new Fruits("melon",56,70,"yellow"));
		f1.add(new Fruits("chicoo",156,80,"brown"));
		f1.add(new Fruits("cherry",26,20,"red"));
		f1.add(new Fruits("strawberry",50,30,"red"));
		f1.add(new Fruits("guvava",196,29,"green"));
		System.out.println("----Sorting it based on calories <100 :---");
		List<Fruits> fcalories = f1.stream().filter(a->a.getCalories()<100)
                .sorted().collect(Collectors.toList());
		System.out.println(fcalories);
		System.out.println("----Sorting it based on colors:---");
		List<String> fcolors=f1.stream()
				.map(c->c.getColor())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(fcolors);
		List<Fruits> fredcolors = f1.stream().filter(z->z.getColor()=="red")
                .sorted().collect(Collectors.toList());
		System.out.println(fredcolors);
	}
}
