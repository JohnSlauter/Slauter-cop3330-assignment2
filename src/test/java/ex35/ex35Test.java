package ex35;

import org.junit.*;

public class ex35Test {

    @Test
    public void rng_test(){

        Assert.assertEquals(App.rng(1), 0);

        Assert.assertTrue(App.rng(10) < 10);

    }


}
