package ex37;

import org.junit.*;

import java.util.ArrayList;

public class ex37Test {

    @Test
    public void list_of_index_test(){

        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();

        App.arraylist_setup(list);

        Assert.assertEquals(App.list_of_index(list,13), 0);

        Assert.assertEquals(App.list_of_index(list,28), 1);

        Assert.assertEquals(App.list_of_index(list,47), 2);

    }

    @Test
    public void adjust_index_test(){

        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();

        App.arraylist_setup(list);

        Assert.assertEquals(App.adjust_index(list, 23, 0), 23);

        Assert.assertEquals(App.adjust_index(list, 26, 1), 0);

        Assert.assertEquals(App.adjust_index(list, 39, 2), 3);

    }


}
