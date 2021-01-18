package com.stephen.persionnal.lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    static L l = new L();
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(l.hashCode()));
        System.out.println(ClassLayout.parseInstance(l).toPrintable());
        List<String> list = new ArrayList<>();
        //System.out.println();list.size()
    }
}
