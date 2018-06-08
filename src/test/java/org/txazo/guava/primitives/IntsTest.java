package org.txazo.guava.primitives;

import com.google.common.primitives.Ints;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntsTest {

    @Test
    public void test() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        Assert.assertTrue(Ints.contains(numbers, 3));
        Assert.assertEquals(1, Ints.min(numbers));
        Assert.assertEquals(5, Ints.max(numbers));
        Assert.assertArrayEquals(numbers, Ints.toArray(Arrays.asList(1, 2, 3, 4, 5)));
    }

}
