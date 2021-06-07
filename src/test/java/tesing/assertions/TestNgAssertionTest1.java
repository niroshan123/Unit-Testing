package tesing.assertions;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNgAssertionTest1 {

    @Test
    public void testAssertEquals(){
        String actualValue = "University Of Moratuwa";
        Assert.assertEquals(actualValue,"University Of Moratuwa"
                , "Failed : String mismatch");
    }

    @Test
    public void testAssertNotEquals(){
        String actualValue = "University Of Moratuwa";
        Assert.assertNotEquals(actualValue,"University 000f Moratuwa"
                , "Failed : String mismatch");
    }

    @Test
    public void testTrue(){

        boolean actualResult = false;
        Assert.assertTrue( actualResult,"failed: boolean mismatch");
    }

    @Test
    public void testFalse(){

        boolean actualResult = false;
        Assert.assertFalse( actualResult,"failed: boolean mismatch");
    }
}
