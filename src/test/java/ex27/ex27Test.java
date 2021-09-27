package ex27;

import ex27.EmployeeValidator;

import org.junit.*;

public class ex27Test {

    private EmployeeValidator tester;

    @Before
    public void setup(){

        tester = new EmployeeValidator();

    }

    @Test
    public void validator_test(){

        Assert.assertEquals(tester.validateEmployee("J", "", "A12-1234", "ABCDE"), "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.");

        Assert.assertEquals(tester.validateEmployee("BR", "UH", "AB-1024", "666666"), "The zipcode must be a 5 digit number.");

        Assert.assertEquals(tester.validateEmployee("UN", "OWEN", "DA-1337", "11037"), "There were no errors found.");

        Assert.assertEquals(tester.validateEmployee("", "OWEN", "DA-1337", "11037"), "The first name must be at least 2 characters long.\n" +
                "The first name must be filled in.");

    }

    @Test
    public void fname_test(){

        Assert.assertEquals(tester.validate_first_name("JR"), 0);

    }

    @Test
    public void lname_test(){

        Assert.assertEquals(tester.validate_last_name(""), 2);

    }

    @Test
    public void ZIP_test(){

        Assert.assertEquals(tester.validate_ZIP("11111"), true);

    }

    @Test
    public void ID_test(){

        Assert.assertEquals(tester.validate_ID("CD-2048"), true);

    }

}
