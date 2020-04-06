package com.letchic.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    static long timeOfArrayList;
    static long timeOfLinkedList;
    static int amountOfRepeat=10000;
    static List<String> arrayListlist = new ArrayList<>();
    static List<String> linkedList = new LinkedList<>();

    public static void testAdd(){
        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            arrayListlist.add("test");
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            linkedList.add("test");
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("add(element)");
        System.out.println("timeOfArrayList  "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }

    public static void testAddtoHead(){
        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            arrayListlist.add(0,"test");
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            linkedList.add(0,"test");
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("add(0, element)");
        System.out.println("timeOfArrayList "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }

    public static void testAddtoMid(){
        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            arrayListlist.add(amountOfRepeat/2,"test");
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < amountOfRepeat; i++) {
            linkedList.add(amountOfRepeat/2,"test");
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("add(size/2, element)");
        System.out.println("timeOfArrayList "+timeOfArrayList/1000000+" ms");
        System.out.println("timeOfLinkedList "+timeOfLinkedList/1000000+" ms");
        System.out.println();
    }
    public static void testGet(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.get(amountOfRepeat/2);
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.get(amountOfRepeat/2);
         timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("get(size/2)");
        System.out.println("timeOfArrayList "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }
    public static void testSet(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.set(amountOfRepeat/2,"anothertest");
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.set(amountOfRepeat/2,"anothertest");
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        System.out.println("set(size/2,element)");
        System.out.println("timeOfArrayList "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }
    public static void testRemove(){
        timeOfArrayList = System.nanoTime();

            arrayListlist.remove(amountOfRepeat/2);

        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();

            linkedList.remove(amountOfRepeat/2);

        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("remove(size/2)");
        System.out.println("timeOfArrayList "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }

    public static void testRemovehead(){
        timeOfArrayList = System.nanoTime();

            arrayListlist.remove(0);

        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();

            linkedList.remove(0);

        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;
        System.out.println("remove(0)");
        System.out.println("timeOfArrayList "+timeOfArrayList+" ns");
        System.out.println("timeOfLinkedList "+timeOfLinkedList+" ns");
        System.out.println();
    }

}
