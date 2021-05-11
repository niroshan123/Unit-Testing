package groups;

import org.testng.annotations.Test;

public class GroupTest2 {

    @Test(groups = {"reg"})
    public void testGT2_1() {
        System.out.println("testGT2_1");
    }

    @Test(groups = {"smoke"})
    public void testGT2_2() {
        System.out.println("testGT2_2");
    }

    @Test(groups = {"smoke","reg"})
    public void testGT2_3() {
        System.out.println("testGT2_3");
    }
}
