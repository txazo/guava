package org.txazo.guava.base;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Map;

public class ImmutableMapTest {

    @Test
    public void test() {
        Map<Integer, String> map1 = ImmutableMap.of(200, "OK", 404, "Not Found", 500, "Internal Server Error");

        Map<Integer, String> map2 = new ImmutableMap.Builder<Integer, String>()
                .put(200, "OK")
                .put(404, "Not Found")
                .put(500, "Internal Server Error")
                .build();
    }

}
