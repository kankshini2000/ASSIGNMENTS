package juntiiexamples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinmaxTest {
	Assign1 minmax;
	@BeforeAll
	static void BeforeAllinit() {
		System.out.println("Checking Min and Max");
	}
	
	@BeforeEach
	void init() {
		minmax=new Assign1();
	}
	int[] arr=new int[] {56, 34, 7,3, 54, 3, 34, 34, 53};
	

	@Test
	void MinMaxValue() {
		int[] expected= {3,56};
		int[] MaxMinValue=minmax.findMinMax(arr,9);
		assertArrayEquals(expected, MaxMinValue,"should get max and min value");
		
	}
}
