package ex34;

import org.junit.*;

public class ex34Test {

    private String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

    @Test
    public void index_test(){

        Assert.assertEquals(App.index_of_employee(employees, "John Smith"), 0);

        Assert.assertEquals(App.index_of_employee(employees, "Chris Jones"), 2);

    }

    @Test
    public void remove_test(){

        Assert.assertEquals(App.remove_employee(employees, "John Smith")[0], "Jackie Jackson");

        Assert.assertEquals(App.remove_employee(employees, "Chris Jones")[2], "Amanda Cullen");

    }

}
