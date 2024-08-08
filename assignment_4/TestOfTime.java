// Program to test Time and Duration Class
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 18 August 2023

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTime {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   @Test public void Test1() {
      Time time = new Time("02:00"); // Creating Time object
      Assert.assertEquals("02:00:00", time.toString());
   }
   
   @Test public void Test2() {
      Time time1 = new Time("02:00");// Creating Time object
      Time time2 = new Time("04:00");
      Duration duration = time2.subtract(time1); // Creating Duration Object
      Assert.assertEquals(120, duration.intValue("minute"));
   }
   
   @Test public void Test3() {
      Time time1 = new Time("02:00");// Creating Time object
      Time time2 = new Time("02:00");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(0, duration.intValue("minute"));
   }
   
   @Test public void Test4() {
      Time time1 = new Time("02:00"); // Creating Time object
      Time time2 = new Time("04:00");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(5400000, duration.intValue("millisecond")); // prints time difference in milliseconds
   }
   
   @Test public void Test5() {
      Time time1 = new Time("02:00"); // Creating Time object
      Time time2 = new Time("04:00");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(7200, duration.intValue("second")); // prints time difference in seconds

   }

   @Test public void Test6() {
      Time time1 = new Time("02:00"); // Creating Time object
      Time time2 = new Time("04:00");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(120, duration.intValue("minute")); // prints time difference in minutes
   }

   @Test public void Test7() {
      Time time1 = new Time("02:00");
      Time time2 = new Time("04:00");
      Duration duration = time2.subtract(time1); // subtrating time 1 from time 2
      Assert.assertEquals(2, duration.intValue("hour")); // prints time difference in hours
   }




}