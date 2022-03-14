package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class assign5 {
	List<String> list = Arrays.asList("pasta", "cake", "sushi", "maggi");

    public static void main(String[] args) {
    	assign5 obj = new assign5();
        processWords(obj.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

         list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
	
		
	}

