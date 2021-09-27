package ex30;

import org.junit.*;

public class ex30Test {

    @Test
    public void table_test(){

        Assert.assertEquals(App.create_table(2), "  1  2\n  2  4\n");

    }

    @Test
    public void num_places_test(){

        Assert.assertEquals(App.num_places(1), 1);

        Assert.assertEquals(App.num_places(10), 2);

        Assert.assertEquals(App.num_places(834), 3);

    }

    @Test
    public void spaces_test(){

        Assert.assertEquals(App.create_space(10,10), " ".repeat(3));

        Assert.assertEquals(App.create_space(1,3), " ".repeat(2));

    }


}
