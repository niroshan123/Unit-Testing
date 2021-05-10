package tesing.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest1 {

    public static void main(String[] args) {
        System.out.println("Hello Test Ng");
    }

    //This is a unit test and can execute idependently
    @Test
    public void print(){
        System.out.println("Hello for method");
    }



}
