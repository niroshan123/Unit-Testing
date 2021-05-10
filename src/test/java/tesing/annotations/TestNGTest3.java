package tesing.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest3 {

    @Test
    public void print1(){
        System.out.println("Hello for method1");
    }

    @Test
    public void print2(){
        System.out.println("Hello for method2");
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
