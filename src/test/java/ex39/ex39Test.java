package ex39;

import org.junit.*;

public class ex39Test {

    private Employee employee1, employee2;

    private int[] longest_length = {0, 0, 0};

    @Test
    public void longest_length_test(){

        employee1 = new Employee("John", "Smith", "CEO", "");

        employee2 = new Employee("Stock", "Name", "Stock", "12-31-1999");

        App.update_longest_length(longest_length, employee1);

        App.update_longest_length(longest_length, employee2);

        Assert.assertEquals(longest_length[0], 10);

        Assert.assertEquals(longest_length[1], 5);

        Assert.assertEquals(longest_length[2], 10);

    }

}
