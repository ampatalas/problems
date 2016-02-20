import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by agnieszka on 20.02.2016.
 */
public class ListSumTest {

    @Test
    public void sumOfZeroNumbersFor() {
        ListSum listSum = new ListSum();
        int[] list = {};
        Assert.assertEquals(0, listSum.forLoop(list));
    }

    @Test
    public void sumOfOneNumberFor() {
        ListSum listSum = new ListSum();
        int[] list = {1};
        Assert.assertEquals(1, listSum.forLoop(list));
    }

    @Test
    public void sumOfNumbersFor() {
        ListSum listSum = new ListSum();
        int[] list = {1, 5};
        Assert.assertEquals(6, listSum.forLoop(list));
    }

    @Test
    public void sumOfZeroNumbersWhile() {
        ListSum listSum = new ListSum();
        int[] list = {};
        Assert.assertEquals(0, listSum.whileLoop(list));
    }

    @Test
    public void sumOfOneNumberWhile() {
        ListSum listSum = new ListSum();
        int[] list = {1};
        Assert.assertEquals(1, listSum.whileLoop(list));
    }

    @Test
    public void sumOfNumbersWhile() {
        ListSum listSum = new ListSum();
        int[] list = {1, 5};
        Assert.assertEquals(6, listSum.whileLoop(list));
    }

    @Test
    public void sumOfZeroNumbersRecursive() {
        ListSum listSum = new ListSum();
        int[] list = {};
        Assert.assertEquals(0, listSum.recursive(list));
    }

    @Test
    public void sumOfOneNumberRecursive() {
        ListSum listSum = new ListSum();
        int[] list = {1};
        Assert.assertEquals(1, listSum.recursive(list));
    }

    @Test
    public void sumOfNumbersRecursive() {
        ListSum listSum = new ListSum();
        int[] list = {1, 5};
        Assert.assertEquals(6, listSum.recursive(list));
    }

}