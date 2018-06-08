package org.txazo.guava.collect;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.Arrays;

public class OrderingTest {

    @Test
    public void test() {
        Ordering.natural().sortedCopy(Arrays.asList(1, 3, 4, 2, 5));
    }

}
