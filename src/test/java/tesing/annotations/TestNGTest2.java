package tesing.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest2 {
    @Test
    public void print(){
        System.out.println("Hello for method");
    }


    @BeforeMethod//pre conditions
    public void beforeMethod(){
        System.out.println("Hello for Before");
    }

    @AfterMethod//post conditions
    public void afterMethod(){
        System.out.println("Hello for After");
    }
}
