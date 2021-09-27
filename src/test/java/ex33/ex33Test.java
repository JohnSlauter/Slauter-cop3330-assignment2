package ex33;

import org.junit.*;

public class ex33Test {

    private magical_eight_ball eight;

    @Before
    public void setup(){

        eight = new magical_eight_ball();

    }

    @Test
    public void respond_test(){

        Assert.assertEquals(eight.respond(0), "Yes");

        Assert.assertEquals(eight.respond(1), "No");

        Assert.assertEquals(eight.respond(2), "Maybe");

        Assert.assertEquals(eight.respond(3), "Ask again later.");

    }

}
