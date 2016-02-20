package com.ampatalas.test;

import com.ampatalas.main.MergeLists;
import org.junit.Assert;
import org.junit.Test;

public class MergeListsTest {

    @Test
    public void mergeEmptyLists() {
        Object[] first = {};
        Object[] second = {};

        MergeLists mergeLists = new MergeLists();
        Object[] expected = {};
        Assert.assertArrayEquals(expected, mergeLists.merge(first, second));
    }

    @Test
    public void mergeEmptyAndNonEmptyList() {
        Object[] first = {};
        Object[] second = {"a", "b", "c"};

        MergeLists mergeLists = new MergeLists();
        Object[] expected = {"a", "b", "c"};
        Assert.assertArrayEquals(expected, mergeLists.merge(first, second));
    }

    @Test
    public void mergeTwoNonEmptyListsOfOneLength() {
        Object[] first = {1, 2, 3};
        Object[] second = {"a", "b", "c"};

        MergeLists mergeLists = new MergeLists();
        Object[] expected = {1, "a", 2, "b", 3, "c"};
        Assert.assertArrayEquals(expected, mergeLists.merge(first, second));
    }

    @Test
    public void mergeTwoNonEmptyListsOfTwoLengths() {
        Object[] first = {1, 2, 3, 4, 5};
        Object[] second = {"a", "b", "c"};

        MergeLists mergeLists = new MergeLists();
        Object[] expected = {1, "a", 2, "b", 3, "c", 4, 5};
        Assert.assertArrayEquals(expected, mergeLists.merge(first, second));
    }

}