package org.txazo.guava.base;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class JoinerTest {

    @Test
    public void test() {
        Assert.assertEquals("1,2,3,4", Joiner.on(",").join(Arrays.asList(1, 2, 3, 4)));
        Assert.assertEquals("1,2,3,4", Joiner.on(",").skipNulls().join(Arrays.asList(null, 1, 2, 3, 4)));
        Assert.assertEquals("0,1,2,3,4", Joiner.on(",").useForNull("0").join(Arrays.asList(null, 1, 2, 3, 4)));
        Assert.assertEquals("id=1&name=root",
                Joiner.on("&").withKeyValueSeparator("=").join(ImmutableMap.of("id", "1", "name", "root")));
    }

}
