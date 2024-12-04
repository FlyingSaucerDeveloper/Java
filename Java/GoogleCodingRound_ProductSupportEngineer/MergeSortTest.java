import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void test1() {

        MergeSort sort = new MergeSort();
        int testArr[] = { 5, 1, 3, 2, 4 };
        int expectedarr[] = { 1, 2, 3, 4, 5 };

        String testString = Arrays.toString(sort.mergeSort(testArr));
        String expected = Arrays.toString(expectedarr);

        Assert.assertEquals(expected, testString);

    }

    @Test
    public void test2() {

        MergeSort sort = new MergeSort();
        int testArr[] = { 0,0,11,22 };
        int expectedarr[] = { 0,0,11,22 };

        String testString = Arrays.toString(sort.mergeSort(testArr));
        String expected = Arrays.toString(expectedarr);

        Assert.assertEquals(expected, testString);

    }


    @Test
    public void test3() {

        MergeSort sort = new MergeSort();
        int testArr[] = {};
        int expectedarr[] = null;

        String testString = Arrays.toString(sort.mergeSort(testArr));
        String expected = Arrays.toString(expectedarr);

        Assert.assertEquals(expected, testString);

    }


}
