package ex31;

import org.junit.*;

public class ex31Test {

    @Test
    public void verify_input_test(){

        Assert.assertEquals(App.verify_input("abc"), false);

        Assert.assertEquals(App.verify_input("65"), true);

    }


    @Test
    public void print_spaces_test(){

        Assert.assertEquals(App.print_spaces(1), " ");

        Assert.assertEquals(App.print_spaces(2), "  ");

        Assert.assertEquals(App.print_spaces(0), "");

    }

    @Test
    public void round_double_test(){

        Assert.assertEquals(App.round_double(1.0), 1);

        Assert.assertEquals(App.round_double(2.4), 2);

        Assert.assertEquals(App.round_double(3.5), 4);

        Assert.assertEquals(App.round_double(0.8), 1);

    }

    @Test
    public void target_heart_rate_test(){

        Assert.assertEquals(App.calc_target_heart_rate(22, 65, 55), 138);

        Assert.assertEquals(App.calc_target_heart_rate(22, 65, 60), 145);

        Assert.assertEquals(App.calc_target_heart_rate(64, 60, 95), 151);

    }

}
