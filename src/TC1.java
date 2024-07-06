import org.testng.annotations.*;
import org.testng.internal.annotations.IBeforeTest;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before class...");}

    @AfterClass
    void afterClass(){
        System.out.println("This will execute before class...");}

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method...");}

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method...");}

    @Test
    void test1(){
        System.out.println("This is Test1...");}

        @Test
        void test2() {
            System.out.println("This is Test2...");
        }

        @BeforeTest
    void beforeTest() {
        System.out.println("\"This will execute before test...");
    }

    @AfterTest
    void afterbeforeTest() {
        System.out.println("\"This will execute after test...");
    }
}

