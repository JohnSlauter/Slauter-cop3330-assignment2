package ex36;

import java.util.ArrayList;

import org.junit.*;

public class ex36Test {

    private ex36.calculator tester;

    @Before
    public void setup(){

        tester = new ex36.calculator();

    }

    @Test
    public void test(){

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] stor = {8,9,11,12};

        for(int i : stor) {

            list.add(i);

        }

        Assert.assertEquals(tester.average(list), 10, .000001);

        Assert.assertEquals(tester.min(list), 8);

        Assert.assertEquals(tester.max(list), 12);

        Assert.assertEquals(tester.std(list), Math.sqrt(2.5), 0.000001);

    }

}
