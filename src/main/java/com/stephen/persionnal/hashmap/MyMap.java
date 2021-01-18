package com.stephen.persionnal.hashmap;

/**
 * 手写hashMap 1.7版本
 * @param <K>
 * @param <V>
 */
public interface MyMap<K,V> {
    /**
     * put方法
     * @param k
     * @param v
     * @return
     */
    V put(K k,V v);

    /**
     * get方法
     * @param k
     * @return
     */
    V get(K k);

    /**
     * 获取长度
     * @return
     */
    int size();

    interface MyEntry<K,V>{
        /**
         * 获取key
         * @return
         */
        K getKey();

        /**
         * 获取value
         * @return
         */
        V getValue();
    }
}
