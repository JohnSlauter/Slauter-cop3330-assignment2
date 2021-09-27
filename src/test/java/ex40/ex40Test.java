package ex40;

import org.junit.*;

import java.util.HashMap;

import java.util.ArrayList;

public class ex40Test {

    private HashMap<String, Employee> tester;

    private int[] longest_length = {0, 0, 0};

    @Before
    public void setup(){

        tester = new HashMap<String, Employee>();

        App.add_employees(tester, longest_length);

    }

    @Test
    public void search_test(){

        ArrayList<String> list = new ArrayList<String>();

        list = App.search("J", tester);

        String temp = "";

        for(String s : list){

            temp = temp.concat(s + "\n");

        }

        Assert.assertEquals(temp, "Johnson\nJackson\nJacobson\n");

    }

}
