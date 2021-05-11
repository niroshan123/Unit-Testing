package tesing.annotations;

import org.testng.annotations.*;

public class TestNGTest4{

    @Test
    public void print1(){
        System.out.println("Test 1");
    }

    @Test
    public void print2(){
        System.out.println("Test 2");
    }


    @BeforeMethod//pre conditions
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod//post conditions
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

}