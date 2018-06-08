package org.txazo.guava.base;

import com.google.common.base.Objects;
import org.junit.Assert;
import org.junit.Test;

public class ObjectsTest {

    @Test
    public void test() {
        Assert.assertTrue(Objects.equal(1, Integer.valueOf(1)));
    }

}
