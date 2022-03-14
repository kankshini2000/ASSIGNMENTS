import java.io.*;
import java.util.*;
public class assign4 {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Java\\src\\file.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        StringBuffer sb=new StringBuffer();
        String line;  
        int count = 0;  
        while((line = br.readLine()) != null) {    
            sb.append(line);
            sb.append(" ");
        	String words[] = line.split("");   
            count = count + words.length; 
        }  
        System.out.println("Contents of File: ");  
        System.out.println(sb.toString()); 
        System.out.println("Number of words present in given file: " + count);  
        br.close(); 
	}
}
