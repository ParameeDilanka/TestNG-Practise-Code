/*
(1) setup - Open browser and application
(2) login
(3) Close
* */

import org.testng.annotations.Test;
public class FirstTestCase {
    @Test(priority=1)
    void setup(){
        System.out.println("Openning Browser");
    }

    @Test(priority=2)
    void login(){
        System.out.println("This is login test");
    }
    @Test(priority=3)
    void testdown(){
        System.out.println("Clossing Browser");
    }
}
