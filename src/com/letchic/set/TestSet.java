package com.letchic.set;

import com.letchic.CSVWriter;
import com.letchic.map.TestMap;

import java.util.*;

public class TestSet {
    private static long timeOfHashSet;
    private static long timeOfLinkedHashSet;
    private static long timeOfTreeSet;
    private static Set<Integer> hashSet = new HashSet<>();
    private static Set<Integer> linkedHashSet = new LinkedHashSet<>();
    private static Set<Integer> treeSet = new TreeSet<>();

    private static int step=10000;
    private static int repeat=1;
    private static int amountOfRepeat;

    private static List <String[]> list =  new ArrayList<>();
    private static String[][] data = new String[9][12];

    public static void getDataFromSet() {
        for (String[] row: data) {
            Arrays.fill(row, "");
        }
        Arrays.fill(data[0],"");
        data[0][0]="Value\\AmountOfRepeat";
        data[1][0]="add(element)";
        data[2][0]="timeOfHashSet";
        data[3][0]="timeOfLinkedHashSet";
        data[4][0]="timeOfTreeSet";
        data[5][0]="remove(element)";
        data[6][0]="timeOfHashSet";
        data[7][0]="timeOfLinkedHashSet";
        data[8][0]="timeOfTreeSet";


        for (int i = 1; i <= 10; i++) {
            amountOfRepeat=step*i;
            hashSet.clear();
            linkedHashSet.clear();
            treeSet.clear();
            testAdd();
            testRemove();

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 9; j++) {
            list.add(data[j]);
        }
        CSVWriter.writeToCsvFile(list,"datafiles/dataSet.csv");
    }


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

        data[2][repeat]=String.valueOf(timeOfHashSet);
        data[3][repeat]=String.valueOf(timeOfLinkedHashSet);
        data[4][repeat]=String.valueOf(timeOfTreeSet);
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

        data[6][repeat]=String.valueOf(timeOfHashSet);
        data[7][repeat]=String.valueOf(timeOfLinkedHashSet);
        data[8][repeat]=String.valueOf(timeOfTreeSet);
    }
}