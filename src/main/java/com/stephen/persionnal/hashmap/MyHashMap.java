package com.stephen.persionnal.hashmap;

public class MyHashMap<K,V> implements MyMap<K,V> {
    //默认容量
    private static int defalutLength =16;
    //加载因子
    private static double defalutLoader =0.75d;

    private MyEntry[] table = null;

    private int size = 0;

    public MyHashMap() {
        this(defalutLength,defalutLoader);
    }

    public MyHashMap(int length, double loader) {
        defalutLength = length;
        defalutLoader = loader;
        table = new MyEntry[defalutLength];
    }

    @Override
    public V put(K k, V v) {
        int index = hash(k);
        MyEntry<K,V> myEntry = table[index];
        if(myEntry == null){
            table[index] = newMyEntry(k,v,null);
            size++;
        }else{
            table[index] = newMyEntry(k,v,myEntry);

        }



        return (V) table[index].getValue();
    }
    public MyEntry<K,V> newMyEntry(K k, V v, MyEntry<K, V> next){
        return new MyEntry<K,V>(k,v,next);
    }
    public int hash(K k){
        int m =defalutLength;
        int index = k.hashCode()%m;
        return index>0?index:-index;
    }

    @Override
    public V get(K k) {
        int index = hash(k);
        if(table[index]==null){
            return null;
        }
        return (V) find(k,table[index]);
    }

    public V find(K k, MyEntry<K,V> myEntry) {
       /* for (int i=0;i<myEntry[i];i++){

        }*/
       if(k==myEntry.getKey()||k.equals(myEntry.getKey())){
           if(myEntry.next!= null){
               System.out.println("老值是：" + myEntry.next.getValue());
           }
            return myEntry.getValue();
       }else{
           if(myEntry.next!=null){
               System.out.println("老值是：" + myEntry.next.getValue());
                return find(k,myEntry);
           }
       }
       return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    class MyEntry<K,V> implements MyMap.MyEntry<K,V>{
        K k;
        V v;
        MyEntry<K,V> next;

        public MyEntry(K k, V v, MyEntry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
