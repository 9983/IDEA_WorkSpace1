package com.zking.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

@Slf4j
public class CacheKeyGenerator implements KeyGenerator {
    // custom cache key
    public static final int NO_PARAM_KEY = 0;
    public static final int NULL_PARAM_KEY = 53;

    @Override
    public Object generate(Object target, Method method, Object... params) {
        StringBuilder key = new StringBuilder();
        key.append(target.getClass().getSimpleName()).append(".").append(method.getName()).append(":");
        if (params.length == 0) {
            key.append(NO_PARAM_KEY);
        } else {
            int count = 0;
            for (Object param : params) {
                if (0 != count) {//参数之间用,进行分隔
                    key.append(',');
                }
                if (param == null) {
                    key.append(NULL_PARAM_KEY);
                } else if (ClassUtils.isPrimitiveArray(param.getClass())) {
                    int length = Array.getLength(param);
                    for (int i = 0; i < length; i++) {
                        key.append(Array.get(param, i));
                        key.append(',');
                    }
                } else if (ClassUtils.isPrimitiveOrWrapper(param.getClass()) || param instanceof String) {
                    key.append(param);
                } else {//Java一定要重写hashCode和eqauls
                    key.append(param.hashCode());
                }
                count++;
            }
        }

        String finalKey = key.toString();
        log.debug("using cache key={}", finalKey);
        return finalKey;
    }
}
