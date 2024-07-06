import org.junit.Assert;
import org.testng.annotations.Test;
/*
(1) setup - Open browser and application
(2) login
(3) Close
* */

import org.testng.annotations.Test;
public class SecondTestCase {
    @Test(priority=1)
    void setup(){
        System.out.println("Openning Browser");
    }

    @Test(priority=3)
    void SearchCustomer(){
        System.out.println("This is search customer test");
       // Assert.assertEquals(1,2);
    }

    @Test(priority=2)
    void addCustomer(){
        System.out.println("This is add customer test");
    }


    @Test(priority=4)
    void testdown(){
        System.out.println("Clossing Browser");
    }
}
