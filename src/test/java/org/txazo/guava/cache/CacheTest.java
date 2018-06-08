package org.txazo.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class CacheTest {

    @Test
    public void test() throws Exception {
        LoadingCache<String, Object> cache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build(new CacheLoader<String, Object>() {

                    @Override
                    public Object load(String key) throws Exception {
                        return getValueByKey(key);
                    }

                });

        System.out.println(cache.get("1000"));
    }

    private Object getValueByKey(String key) {
        return key;
    }

}
