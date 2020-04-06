package com.letchic.map;

import java.util.*;

public class TestMap {
    static long timeOfHashMap;
    static long timeOfLinkedHashMap;
    static long timeOfTreeMap;

    static int amountOfRepeat = 100000;

    static Map<Integer,String> hashMap = new HashMap<>();
    static Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
    static Map<Integer,String> treeMap = new TreeMap<>();




    public static void testPut() {
        timeOfHashMap = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            hashMap.put(i,"test");
        }
        timeOfHashMap = System.nanoTime() - timeOfHashMap;


        timeOfLinkedHashMap = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            linkedHashMap.put(i,"test");
        }
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            treeMap.put(i,"test");
        }
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;



        System.out.println("add(element)");
        System.out.println("timeOfHashMap       " + timeOfHashMap + " ns");
        System.out.println("timeOfLinkedHashMap " + timeOfLinkedHashMap + " ns");
        System.out.println("timeOfTreeMap       " + timeOfTreeMap + " ns");
        System.out.println();
    }

    public static void testGet() {
        timeOfHashMap = System.nanoTime();
            hashMap.get(amountOfRepeat/2);
        timeOfHashMap = System.nanoTime() - timeOfHashMap;


        timeOfLinkedHashMap = System.nanoTime();
            linkedHashMap.get(amountOfRepeat/2);
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
            treeMap.get(amountOfRepeat/2);
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;

        System.out.println("get(element)");
        System.out.println("timeOfHashMap       " + timeOfHashMap + " ns");
        System.out.println("timeOfLinkedHashMap " + timeOfLinkedHashMap + " ns");
        System.out.println("timeOfTreeMap       " + timeOfTreeMap + " ns");
        System.out.println();
    }

    public static void testRemove() {
        timeOfHashMap = System.nanoTime();
            hashMap.remove(amountOfRepeat/2);
        timeOfHashMap = System.nanoTime() - timeOfHashMap;


        timeOfLinkedHashMap = System.nanoTime();
            linkedHashMap.remove(amountOfRepeat/2);
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
            treeMap.remove(amountOfRepeat/2);
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;

        System.out.println("remove(element)");
        System.out.println("timeOfHashMap       " + timeOfHashMap + " ns");
        System.out.println("timeOfLinkedHashMap " + timeOfLinkedHashMap + " ns");
        System.out.println("timeOfTreeMap       " + timeOfTreeMap + " ns");
        System.out.println();
    }




}
