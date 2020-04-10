package com.letchic.map;

import com.letchic.CSVWriter;

import java.util.*;

public class TestMap {
    private static long timeOfHashMap;
    private static long timeOfLinkedHashMap;
    private static long timeOfTreeMap;

    private static int step=10000;
    private static int repeat=1;
    private static int amountOfRepeat;

    private static Map<Integer,String> hashMap = new HashMap<>();
    private static Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
    private static Map<Integer,String> treeMap = new TreeMap<>();

    private static List <String[]> list =  new ArrayList<>();
    private static String[][] data = new String[13][12];

    public static void getDataFromMap() {
        for (String[] row: data) {
            Arrays.fill(row, "");
        }
        Arrays.fill(data[0],"");
        data[0][0]="Value\\AmountOfRepeat";
        data[1][0]="add(element)";
        data[2][0]="timeOfHashMap";
        data[3][0]="timeOfLinkedHashMap";
        data[4][0]="timeOfTreeMap";
        data[5][0]="get(element)";
        data[6][0]="timeOfHashMap";
        data[7][0]="timeOfLinkedHashMap";
        data[8][0]="timeOfTreeMap";
        data[9][0]="remove(element)";
        data[10][0]="timeOfHashMap";
        data[11][0]="timeOfLinkedHashMap";
        data[12][0]="timeOfTreeMap";


        for (int i = 1; i <= 10; i++) {
            amountOfRepeat=step*i;
            hashMap.clear();
            linkedHashMap.clear();
            treeMap.clear();
            testPut();
            testGet();
            testRemove();

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 13; j++) {
            list.add(data[j]);
        }
        CSVWriter.writeToCsvFile(list,"datafiles/dataMap.csv");
    }

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

        data[2][repeat]=String.valueOf(timeOfHashMap);
        data[3][repeat]=String.valueOf(timeOfLinkedHashMap);
        data[4][repeat]=String.valueOf(timeOfTreeMap);
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

        data[6][repeat]=String.valueOf(timeOfHashMap);
        data[7][repeat]=String.valueOf(timeOfLinkedHashMap);
        data[8][repeat]=String.valueOf(timeOfTreeMap);
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

        data[10][repeat]=String.valueOf(timeOfHashMap);
        data[11][repeat]=String.valueOf(timeOfLinkedHashMap);
        data[12][repeat]=String.valueOf(timeOfTreeMap);
    }
}
