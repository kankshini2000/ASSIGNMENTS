package generic;

import java.util.HashMap;
import java.util.Map;
public class assign5q2 {
	public static void main(String[] args) {
		Map<String, String> objMap = new HashMap<String, String>();
	    objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2-wheeler");
	    objMap.put("Price", "85000");
	    objMap.put("Name", "Maruti");
	    objMap.put("Power", "220");
	    objMap.put("Type", "4-wheeler");
	    objMap.put("Price", "85000");
	    objMap.put("Name", "Scootypept");
	    objMap.put("Power", "220");
	    System.out.println("Elements of the Map:");
	    System.out.println("Size of map is:- "+ objMap.size());
	    System.out.println(objMap);
	}
}
