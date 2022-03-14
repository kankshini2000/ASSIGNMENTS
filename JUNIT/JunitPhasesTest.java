package juntiiexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitPhasesTest {
	Assign4 objects;
    @BeforeAll
     static void start(){
        System.out.println("Testing process is starting");
    }
    @AfterAll
     static void finish(){
        System.out.println("Testing Process completed");
    }

    @BeforeEach
    void init(){
    	objects=new Assign4();
    }
    @AfterEach
    void TestDone(){
        System.out.println("Test completed");
    }

   @Test
   void testAdd() {
        int expected = 2;
       int actual = objects.add(1,1);
       assertEquals(expected,actual,"The add method should add two numbers");

   }
   @Test
   void testDivide() {

       assertThrows(ArithmeticException.class, () -> objects.divide(1,0),
               "Divide should throw ArithmeticException when denominator is zero");
   }
   @Test
   void testcomputeCircleRadius() {

       assertEquals(314.1592653589793,objects.computeCircleArea(10),"Should return right circle Area");
   }

}
