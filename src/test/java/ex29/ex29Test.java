package ex29;

import org.junit.*;

public class ex29Test {

    @Test
    public void valid_input_test(){

        Assert.assertEquals(App.is_valid_number("a"), false);

        Assert.assertEquals(App.is_valid_number("0"), false);

        Assert.assertEquals(App.is_valid_number("12"), true);

    }

    @Test
    public void ceiling_test(){

        Assert.assertEquals(App.ceiling(4.5), 5);

        Assert.assertEquals(App.ceiling(4), 4);

        Assert.assertEquals(App.ceiling(0.0001), 1);

    }

    @Test
    public void doubling_time_test(){

        Assert.assertEquals(App.doubling_time(12), 72/12, 0.000001);

        Assert.assertEquals(App.doubling_time(1), 72/1, 0.000001);

        Assert.assertEquals(App.doubling_time(64),  App.ceiling(72.0/64), 0.000001);

    }

    @Test
    public void string_to_int_test(){

        Assert.assertEquals(App.String_to_int("654321"), 654321);

        Assert.assertEquals(App.String_to_int("12"), 12);

        Assert.assertEquals(App.String_to_int("0"), 0);

        Assert.assertEquals(App.String_to_int("abcdef"), 0);

    }

    @Test
    public void pow_test(){

        Assert.assertEquals(App.pow(10,2), 100);

        Assert.assertEquals(App.pow(9,4), 9*9*9*9);

        Assert.assertEquals(App.pow(4,0), 1);

    }


}
