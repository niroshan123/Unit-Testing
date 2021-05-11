package groups;

import org.testng.annotations.Test;
//group as cricality
// best practices in unit test is writing group your testing
//everytime you write a code group it
public class GroupTest1 {

    @Test(groups = {"smoke","reg"})
    public void testGT1_1() {
        System.out.println("testGT1_1");
    }

    @Test(groups = {"reg"})
    public void testGT1_2() {
        System.out.println("testGT1_2");
    }

    @Test
    public void testGT1_3() {
        System.out.println("testGT1_3");
    }

    @Test(groups = {"smoke"})
    public void testGT1_4() {
        System.out.println("testGT1_4");
    }
}
