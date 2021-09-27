package ex25;

import org.junit.*;

import static org.junit.Assert.*;

public class ex25Test {

    App tester;

    @Before
    public void setup() {

        tester = new App();

    }


    @Test
    public void passwordValidator_test(){

        assertEquals(tester.passwordValidator("123456"), 0);

        assertEquals(tester.passwordValidator("TESTER"), 1);

        assertEquals(tester.passwordValidator("Password12"), 2);

        assertEquals(tester.passwordValidator("Password12!"), 3);

    }

    @Test
    public void evaluate_password_test(){

        assertEquals(tester.evaluate_password(0), "very weak");

        assertEquals(tester.evaluate_password(1), "weak");

        assertEquals(tester.evaluate_password(2), "strong");

        assertEquals(tester.evaluate_password(3), "very strong");

    }


}
