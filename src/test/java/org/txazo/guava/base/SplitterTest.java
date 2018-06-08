package org.txazo.guava.base;

import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

public class SplitterTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(new String[]{"1", "2", "3", "4"},
                Splitter.on(",").trimResults().omitEmptyStrings().splitToList("1 ,, , 2, 3 ,4")
                        .toArray(new String[]{}));

        Assert.assertArrayEquals(new String[]{"12", "34", "56", "78", "9"},
                Splitter.fixedLength(2).splitToList("123456789")
                        .toArray(new String[]{}));

        Assert.assertArrayEquals(new String[]{"1", "2", "3", "4", "5"},
                Splitter.onPattern("\\s").splitToList("1 2\t3\n4\r5")
                        .toArray(new String[]{}));
    }

}
