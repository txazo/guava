package org.txazo.guava.base;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class JoinerTest {

    @Test
    public void test() {
        Assert.assertEquals("1,2,3,4,5", Joiner.on(",").join(Arrays.asList(1, 2, 3, 4, 5)));
    }

}
