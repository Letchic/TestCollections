package com.letchic.set;

import java.util.*;

public class TestSet {
    static long timeOfHashSet;
    static long timeOfLinkedHashSet;
    static long timeOfTreeSet;

    static int amountOfRepeat = 100000;

    static Set<Integer> hashSet = new HashSet<>();
    static Set<Integer> linkedHashSet = new LinkedHashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();




    public static void testAdd() {
        timeOfTreeSet = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            treeSet.add((int)(Math.random()*amountOfRepeat));
        }
        timeOfTreeSet = System.nanoTime() - timeOfTreeSet;


        timeOfLinkedHashSet = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            linkedHashSet.add((int)(Math.random()*amountOfRepeat));
        }
        timeOfLinkedHashSet = System.nanoTime() - timeOfLinkedHashSet;
        timeOfHashSet = System.nanoTime();

        for (int i = 0; i < amountOfRepeat; i++) {
            hashSet.add((int)(Math.random()*amountOfRepeat));
        }
        timeOfHashSet = System.nanoTime() - timeOfHashSet;



        System.out.println("add(element)");
        System.out.println("timeOfHashSet       " + timeOfHashSet + " ns");
        System.out.println("timeOfLinkedHashSet " + timeOfLinkedHashSet + " ns");
        System.out.println("timeOfTreeSet       " + timeOfTreeSet + " ns");
        System.out.println();
    }

    public static void testRemove() {
        timeOfHashSet = System.nanoTime();
            hashSet.remove(amountOfRepeat/2);
        timeOfHashSet = System.nanoTime() - timeOfHashSet;

        timeOfLinkedHashSet = System.nanoTime();
            linkedHashSet.remove(amountOfRepeat/2);
        timeOfLinkedHashSet = System.nanoTime() - timeOfLinkedHashSet;

        timeOfTreeSet = System.nanoTime();
            treeSet.remove(amountOfRepeat/2);
        timeOfTreeSet = System.nanoTime() - timeOfTreeSet;

        System.out.println("remove(element)");
        System.out.println("timeOfHashSet       " + timeOfHashSet + " ns");
        System.out.println("timeOfLinkedHashSet " + timeOfLinkedHashSet + " ns");
        System.out.println("timeOfTreeSet       " + timeOfTreeSet + " ns");
        System.out.println();
    }


}