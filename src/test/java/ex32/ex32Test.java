package ex32;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ex32Test {

    private guessing_game tester;

    @Before
    public void setup(){

        tester = new guessing_game();

    }

    @Test
    public void is_int_test(){

        Assert.assertEquals(tester.is_int("a"), false);

        Assert.assertEquals(tester.is_int("3"), true);

        Assert.assertEquals(tester.is_int("#%!!@#!@$#@$%$#^%$#"), false);

    }

}
