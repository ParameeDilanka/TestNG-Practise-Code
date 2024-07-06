import org.testng.annotations.Test;

public class Groupingexample {
    @Test(groups={"regression"})
    void test1(){
        System.out.println("This is Test1...");}

    @Test(groups={"Sanity"})
    void test2() {
        System.out.println("This is Test2...");
    }

    @Test(groups={"regression"})
    void test3(){
        System.out.println("This is Test3...");}

    @Test(groups={"regression"})
    void test4() {
        System.out.println("This is Test4...");
    }

    @Test(groups={"regression","Sanity"})
    void test5() {
        System.out.println("This is Test5...");
    }
}
