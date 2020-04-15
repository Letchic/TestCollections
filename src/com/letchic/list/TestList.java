package com.letchic.list;

import com.letchic.TestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestList extends TestData {
    private List<Object> arraylist = new ArrayList<>();
    private List<Object> linkedList = new LinkedList<>();
    private List <String[]> list =  new ArrayList<>();
    private String[][] data = new String[22][12];

    public void getData() {
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
            step=2000;
            amountOfRepeat=step*i;
            arraylist.clear();
            linkedList.clear();

            data[2][repeat]=listoperation(arraylist, (List, x) -> List.add(x),amountOfRepeat);
            data[3][repeat]=listoperation(linkedList, (List, x) -> List.add(x),amountOfRepeat);
            data[5][repeat]=listoperation(arraylist, (List, x) -> List.add(0,x),amountOfRepeat);
            data[6][repeat]=listoperation(linkedList, (List, x) -> List.add(0,x),amountOfRepeat);
            data[8][repeat]=listoperation(arraylist, (List, x) -> List.add(amountOfRepeat/2,x),amountOfRepeat);
            data[9][repeat]=listoperation(linkedList, (List, x) -> List.add(amountOfRepeat/2,x),amountOfRepeat);
            data[11][repeat]=listoperation(arraylist, (List, x) -> List.get(amountOfRepeat/2),amountOfRepeat);
            data[12][repeat]=listoperation(linkedList, (List, x) -> List.get(amountOfRepeat/2),amountOfRepeat);
            data[14][repeat]=listoperation(arraylist, (List, x) -> List.set((amountOfRepeat/2),x),amountOfRepeat);
            data[15][repeat]=listoperation(linkedList, (List, x) -> List.set((amountOfRepeat/2),x),amountOfRepeat);
            data[17][repeat]=listoperation(arraylist, (List, x) -> List.remove(amountOfRepeat/2),amountOfRepeat);
            data[18][repeat]=listoperation(linkedList, (List, x) -> List.remove(amountOfRepeat/2),amountOfRepeat);
            data[20][repeat]=listoperation(arraylist, (List, x) -> List.remove(0),amountOfRepeat);
            data[21][repeat]=listoperation(linkedList, (List, x) -> List.remove(0),amountOfRepeat);

            data[0][repeat]=String.valueOf(amountOfRepeat);
            repeat++;
        }
        for (int j = 0; j < 22; j++) {
            list.add(data[j]);
        }
        writeToCsvFile(list,"datafiles/dataList.csv");
    }

    private String listoperation(List<Object> list, OperationOnList<Object> action, int iteration) {
        long time = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            action.run(list, new Object());
        }
        return String.valueOf(System.nanoTime() - time);
    }
}
