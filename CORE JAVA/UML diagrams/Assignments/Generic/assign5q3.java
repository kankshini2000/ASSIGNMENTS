package generic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Generics<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class assign5q3 {
	private static void test() {
		Integer arr[] = {1,2,3,4,5};
		Generics<Integer> objGeneric = new Generics<>();
		Integer[] arr1=objGeneric.swap(arr, 0, 3);
		for(int i : arr1) {
			System.out.println(i);
		}
	}
}
