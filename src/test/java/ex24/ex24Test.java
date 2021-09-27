package ex24;

import org.junit.*;

public class ex24Test
{

    @Test
    public void test()
    {

        Assert.assertEquals(App.isAnagram("dad", "add"), "\"dad\" and \"add\" are anagrams.");

        Assert.assertEquals(App.isAnagram("not", "anagrams."), "\"not\" and \"anagrams.\" are not anagrams.");

    }

}
