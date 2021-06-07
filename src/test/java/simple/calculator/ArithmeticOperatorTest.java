package simple.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticOperatorTest {

    ArithmeticOperator calc ;

    @BeforeClass
    public void setUp(){
        calc = new ArithmeticOperator();
    }

//    @Test
//    public void testSum(){
//        int actualValue = 35;
//        Assert.assertEquals(calc.sum(10,25),35
//                , "Failed : calculaing sum fails");
//        Assert.assertEquals(calc.sum(-100,-25),-105
//                , "Failed : calculaing sum fails");
//        Assert.assertEquals(calc.sum(-1,1),0
//                , "Failed : calculaing sum fails");
//        Assert.assertEquals(calc.sum(0,-1),-1
//                , "Failed : calculaing sum fails");
//    }

    @Test(dataProvider = "getData")
    public void testSum(int input1,int input2,int expected,String message){

        Assert.assertEquals(calc.sum(input1, input2),expected
                , message);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {100,200,300,"Failed : calculaing sum fails"},
                {-100,-200,-300,"Failed : calculaing sum fails"},
                {-1,1,0,"Failed : calculaing sum fails"},
                {0,-1,-1,"Failed : calculaing sum fails"}

        };
    }

}
