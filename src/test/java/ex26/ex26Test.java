package ex26;

import static org.junit.Assert.*;
import org.junit.*;
import ex26.PaymentCalculator;

public class ex26Test
{

    private static final double dv = 0.000001;

    private PaymentCalculator tester;

    @Before
    public void setup(){

        tester = new PaymentCalculator();

    }

    @Test
    public void ceiling_test(){

        assertEquals(tester.ceiling(13.25), 14 );

        assertEquals(tester.ceiling(0.1), 1);

        assertEquals(tester.ceiling(1.5), 2);

    }

    @Test
    public void round_cents_test(){

        assertEquals(tester.round_cents(1.243), 1.24, dv);

        assertEquals(tester.round_cents(2.505), 2.51, dv);

        assertEquals(tester.round_cents(10.767), 10.77, dv);

    }

    @Test
    public void months_test(){

        assertEquals(tester.calculateMonthsUntilPaidOff(5000, 12, 100), 70);

        assertEquals(tester.calculateMonthsUntilPaidOff(3000, 50, 150), 45);

    }

    @Test
    public void percentage_test(){

        assertEquals(tester.percentage_to_decimal(100), 1.0, 0.000001);

    }

}