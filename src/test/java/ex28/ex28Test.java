package ex28;

import org.junit.*;

public class ex28Test {

    @Test
    public void summation_test(){

        Assert.assertEquals(App.summation(new int[]{1, 2, 3}), 6);

        Assert.assertEquals(App.summation(new int[]{3, 6, 5}), 14);

        Assert.assertEquals(App.summation(new int[]{100000, 10000, 1000, 100, 10, 1}), 111111);

    }

    @Test
    public void string_to_int_test(){

        Assert.assertEquals(App.String_to_int("654321"), 654321);

        Assert.assertEquals(App.String_to_int("-12"), -12);

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
