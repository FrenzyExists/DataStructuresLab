package Lab1.practice.src.bag;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Fernando Bermudez
 *
 * DO NOT RUN THIS JUNIT TEST CASE WITHOUT IMPLEMENTING THE METHODS
 * ON THE ArrayBag CALSS & INTERFACE FIRST
 *
 */

public class ArrayBagTest {


    Bag<Integer> b1;
    Bag<Integer> b2;
    Bag<Integer> b3;
    Bag<Integer> b4;


    Bag<Integer> bagAdjustTest1;
    Bag<Integer> bagAdjustTest2;
    Bag<Integer> bagAdjustTest3;
    Bag<Integer> bagAdjustTest4;

    @Before
    public void setUp() {

        b1 = new ArrayBag<Integer>();
        b2 = new ArrayBag<Integer>();
        b3 = new ArrayBag<Integer>();
        b4 = new ArrayBag<Integer>();

        bagAdjustTest1 = new ArrayBag<Integer>();
        bagAdjustTest2 = new ArrayBag<Integer>();
        bagAdjustTest3 = new ArrayBag<Integer>();
        bagAdjustTest4 = new ArrayBag<Integer>();

        loadDefaultBag1(b1);
        loadDefaultBag2(b2);
        loadDefaultBag2(b3);
        loadDefaultBag1(b4);

        loadDefaultBag3(bagAdjustTest1);
        loadDefaultBag4(bagAdjustTest2);
        loadDefaultBag5(bagAdjustTest3);
        loadDefaultBag6(bagAdjustTest4);
    }

    @Test
    public void testEquals() {

        loadDefaultBag1(b1);
        loadDefaultBag2(b2);
        loadDefaultBag2(b3);
        loadDefaultBag1(b4);

        assertFalse("Failed to return false on equals()", b1.equals(b2));
        assertTrue("Failed to return true on equals()", b2.equals(b3));
        assertFalse("Failed to return fasle on equals()", b3.equals(b4));
        assertTrue("Failed to return true on equals()", b4.equals(b1));

    }

    @Test
    public void testBagAdjuster() {



        Integer[] result1 = {1,1,2,2,3,3,4,4,5,5};
        Integer[] result2 = {1,2,3};
        Integer[] result3 = {1,1,1,2,2,2,3,3,3,4,4,4};
        Integer[] result4 = {1,1,1,1,1,2,2,2,2,2};


        bagAdjustTest1.bagAdjuster(2);
        bagAdjustTest2.bagAdjuster(1);
        bagAdjustTest3.bagAdjuster(3);
        bagAdjustTest4.bagAdjuster(5);


        Object[] bag1 = bagAdjustTest1.toArray();
        Object[] bag2 = bagAdjustTest2.toArray();
        Object[] bag3 = bagAdjustTest3.toArray();
        Object[] bag4 = bagAdjustTest4.toArray();

        Arrays.sort(bag1);
        Arrays.sort(bag2);
        Arrays.sort(bag3);
        Arrays.sort(bag4);



        assertTrue("Failed to modify bag 1 to have only 2 copies of each element", Arrays.equals(bag1, result1));
        assertTrue("Failed to modify bag 2 to have only 1 copy of each element", Arrays.equals(bag2, result2));
        assertTrue("Failed to modify bag 3 to have only 3 copies of each element", Arrays.equals(bag3, result3));
        assertTrue("Failed to modify bag 4 to have only 5 copies of each element", Arrays.equals(bag4, result4));


    }


    private void loadDefaultBag1(Bag<Integer> b) {
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(3);

    }


    private void loadDefaultBag2(Bag<Integer> b) {
        b.add(1);
        b.add(2);
        b.add(4);
        b.add(3);
        b.add(3);
    }


    private void loadDefaultBag3(Bag<Integer> b) {

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(3);
        b.add(4);
        b.add(4);
        b.add(4);
        b.add(4);
        b.add(5);

    }


    private void loadDefaultBag4(Bag<Integer> b) {

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(3);
        b.add(2);
        b.add(2);
        b.add(3);
        b.add(2);
        b.add(1);

    }


    private void loadDefaultBag5(Bag<Integer> b) {

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(3);
        b.add(4);
        b.add(4);
        b.add(4);
        b.add(4);
        b.add(2);

    }


    private void loadDefaultBag6(Bag<Integer> b) {

        b.add(1);
        b.add(2);
        b.add(1);
        b.add(2);
        b.add(1);
        b.add(2);
        b.add(1);
        b.add(2);
        b.add(1);
        b.add(1);

    }

}
