package com.letchic.list;

import com.letchic.CSVWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    private static long timeOfArrayList;
    private static long timeOfLinkedList;
    private static int step=2000;
    private static int repeat=1;
    private static int amountOfRepeat;
    private static List<String> arrayListlist = new ArrayList<>();
    private static List<String> linkedList = new LinkedList<>();

    static List <String[]> list =  new ArrayList<>();
    private static String[][] data = new String[22][12];


    public static void getDataFromList() {
        for (String[] row: data) {
            Arrays.fill(row, "");
        }
        Arrays.fill(data[0],"");
        data[0][0]="Value\\AmountOfRepeat";
        data[1][0]="add(element)";
        data[2][0]="timeOfArrayList";
        data[3][0]="timeOfLinkedList";
        data[4][0]="add(0, element)";
        data[5][0]="timeOfArrayList";
        data[6][0]="timeOfLinkedList";
        data[7][0]="add(size/2, element)";
        data[8][0]="timeOfArrayList";
        data[9][0]="timeOfLinkedList";
        data[10][0]="get(size/2)";
        data[11][0]="timeOfArrayList";
        data[12][0]="timeOfLinkedList";
        data[13][0]="set(size/2,element)";
        data[14][0]="timeOfArrayList";
        data[15][0]="timeOfLinkedList";
        data[16][0]="remove(size/2)";
        data[17][0]="timeOfArrayList";
        data[18][0]="timeOfLinkedList";
        data[19][0]="remove(0)";
        data[20][0]="timeOfArrayList";
        data[21][0]="timeOfLinkedList";

        for (int i = 1; i <= 10; i++) {

            amountOfRepeat=step*i;
            arrayListlist.clear();
            linkedList.clear();
            testAdd();
            testAddtoHead();
            testAddtoMid();
            testGet();
            testSet();
            testRemove();
            testRemovehead();

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 22; j++) {
            list.add(data[j]);
        }
        CSVWriter.writeToCsvFile(list,"datafiles/dataList.csv");
    }

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

        data[2][repeat]=String.valueOf(timeOfArrayList);
        data[3][repeat]=String.valueOf(timeOfLinkedList);
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

        data[5][repeat]=String.valueOf(timeOfArrayList);
        data[6][repeat]=String.valueOf(timeOfLinkedList);
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

        data[8][repeat]=String.valueOf(timeOfArrayList);
        data[9][repeat]=String.valueOf(timeOfLinkedList);
    }
    public static void testGet(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.get(amountOfRepeat/2);
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.get(amountOfRepeat/2);
         timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        data[11][repeat]=String.valueOf(timeOfArrayList);
        data[12][repeat]=String.valueOf(timeOfLinkedList);
    }
    public static void testSet(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.set(amountOfRepeat/2,"anothertest");
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.set(amountOfRepeat/2,"anothertest");
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;


        data[14][repeat]=String.valueOf(timeOfArrayList);
        data[15][repeat]=String.valueOf(timeOfLinkedList);
    }
    public static void testRemove(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.remove(amountOfRepeat/2);
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.remove(amountOfRepeat/2);
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        data[17][repeat]=String.valueOf(timeOfArrayList);
        data[18][repeat]=String.valueOf(timeOfLinkedList);

    }

    public static void testRemovehead(){
        timeOfArrayList = System.nanoTime();
            arrayListlist.remove(0);
        timeOfArrayList = System.nanoTime() - timeOfArrayList;

        timeOfLinkedList = System.nanoTime();
            linkedList.remove(0);
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        data[20][repeat]=String.valueOf(timeOfArrayList);
        data[21][repeat]=String.valueOf(timeOfLinkedList);
    }
}
