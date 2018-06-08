package org.txazo.guava.base;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class PreconditionsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCheckArgument() {
        Object param = null;
        Preconditions.checkArgument(param != null, "param is null");
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNotNull() {
        Object param = null;
        Preconditions.checkNotNull(param, "param is null");
    }

}
