package com.letchic.map;

import com.letchic.TestData;
import java.util.*;

public class TestMap extends TestData {
    private Map<Integer,Object> hashMap = new HashMap<>();
    private Map<Integer,Object> linkedHashMap = new LinkedHashMap<>();
    private Map<Integer,Object> treeMap = new TreeMap<>();
    private List <String[]> list =  new ArrayList<>();
    private String[][] data = new String[13][12];

    public void getData() {
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

            data[2][repeat]=mapoperation(hashMap,(Map,key, x)->Map.put(key,x),amountOfRepeat);
            data[3][repeat]=mapoperation(linkedHashMap,(Map,key, x)->Map.put(key,x),amountOfRepeat);
            data[4][repeat]=mapoperation(treeMap,(Map,key, x)->Map.put(key,x),amountOfRepeat);
            data[6][repeat]=mapoperation(hashMap,(Map,key, x)->Map.get(amountOfRepeat/2),amountOfRepeat);
            data[7][repeat]=mapoperation(linkedHashMap,(Map,key, x)->Map.get(amountOfRepeat/2),amountOfRepeat);
            data[8][repeat]=mapoperation(treeMap,(Map,key, x)->Map.get(amountOfRepeat/2),amountOfRepeat);
            data[10][repeat]=mapoperation(hashMap,(Map,key, x)->Map.remove(amountOfRepeat/2),amountOfRepeat);
            data[11][repeat]=mapoperation(linkedHashMap,(Map,key, x)->Map.remove(amountOfRepeat/2),amountOfRepeat);
            data[12][repeat]=mapoperation(treeMap,(Map,key, x)->Map.remove(amountOfRepeat/2),amountOfRepeat);

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 13; j++) {
            list.add(data[j]);
        }
        writeToCsvFile(list,"datafiles/dataMap.csv");
    }

    private String  mapoperation (Map<Integer,Object> map, OperationOnMap<Object> action, int iteration) {
        long time = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            action.run(map, i, new Object());
        }
        return String.valueOf(System.nanoTime() - time);
    }
}
