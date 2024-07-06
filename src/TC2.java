import org.testng.annotations.*;

public class TC2 {

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
    void test3(){
        System.out.println("This is Test3...");}

    @Test
    void test4() {
        System.out.println("This is Test4...");
    }
    @BeforeSuite
    void beforeSuits() {
        System.out.println("\"This will execute before  test suits...");
    }

    @AfterSuite
    void afterSuits() {
        System.out.println("\"This will execute after  test suits...");
    }
}

