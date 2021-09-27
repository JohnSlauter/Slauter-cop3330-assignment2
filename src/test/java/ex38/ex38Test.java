package ex38;

import org.junit.*;

import org.junit.jupiter.api.RepeatedTest;

import java.util.ArrayList;

public class ex38Test {

    @Test
    public void convert_input_test(){

        Assert.assertArrayEquals(App.convert_input("1 7 3 4"), new int[]{1, 7, 3, 4});

        Assert.assertArrayEquals(App.convert_input("2 -14 452 94"), new int[]{2, -14, 452, 94});

    }

    @RepeatedTest(10)
    public void evens_test(){

        int n = (int)(Math.random()*101);

        int[] all_list = new int[n+1];

        ArrayList<Integer> evens_list = new ArrayList<>();

        for(int i = 0; i <= n; i++){

            all_list[i] = i;

            if(i%2 == 0) {

                evens_list.add(i);

            }

        }

        Assert.assertEquals(App.filterEvenNumbers(all_list), evens_list);


    }

}
