import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTimeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void Test1() {
      Time time = new Time("03:25");
      Assert.assertEquals("03:25:00", time.toString());
   }
   
   @Test public void Test2() {
      Time time1 = new Time("3:09");
      Time time2 = new Time("16:59");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(830, duration.intValue("minute"));
   }
   
   @Test public void Test3() {
      Time time1 = new Time("03:00");
      Time time2 = new Time("03:00");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(0, duration.intValue("minute"));
   }
   
   @Test public void Test4() {
      Time time1 = new Time("3:09");
      Time time2 = new Time("16:59");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(49800000, duration.intValue("millisecond"));
   }
   
   @Test public void Test5() {
      Time time1 = new Time("3:09");
      Time time2 = new Time("16:59");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(49800, duration.intValue("second"));
   }

   @Test public void Test6() {
      Time time1 = new Time("3:09");
      Time time2 = new Time("16:59");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(830, duration.intValue("minute"));
   }

   @Test public void Test7() {
      Time time1 = new Time("3:09");
      Time time2 = new Time("16:59");
      Duration duration = time2.subtract(time1);
      Assert.assertEquals(13, duration.intValue("hour"));
   }




}
