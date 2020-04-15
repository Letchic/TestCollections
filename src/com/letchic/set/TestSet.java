package com.letchic.set;

import com.letchic.TestData;
import java.util.*;

public class TestSet extends TestData {
    private Set<Object> hashSet = new HashSet<>();
    private Set<Object> linkedHashSet = new LinkedHashSet<>();
    private Set<Object> treeSet = new TreeSet<>();
    private List <String[]> list =  new ArrayList<>();
    private String[][] data = new String[9][12];

    public void getData() {
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

            data[2][repeat]=setOperation(hashSet, (Set, x) -> Set.add(x),amountOfRepeat);
            data[3][repeat]=setOperation(linkedHashSet, (Set, x) -> Set.add(x),amountOfRepeat);
            data[4][repeat]=setOperation(treeSet, (Set, x) -> Set.add(x),amountOfRepeat);
            data[6][repeat]=setOperation(hashSet, (Set, x) -> Set.remove(amountOfRepeat/2),amountOfRepeat);
            data[7][repeat]=setOperation(linkedHashSet, (Set, x) -> Set.remove(amountOfRepeat/2),amountOfRepeat);
            data[8][repeat]=setOperation(treeSet, (Set, x) -> Set.remove(amountOfRepeat/2),amountOfRepeat);

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 9; j++) {
            list.add(data[j]);
        }
        writeToCsvFile(list,"datafiles/dataSet.csv");
    }

    private String setOperation(Set<Object> set, OperationOnSet<Object> action, int iteration) {
        long time = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            action.run(set, (int)(Math.random()*amountOfRepeat));
        }
        return String.valueOf(System.nanoTime() - time);
    }
}