package com.letchic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class TestData {
    protected int amountOfRepeat;
    protected int repeat=1;
    protected int step=10000;
    protected abstract void getData();

    public static void writeToCsvFile(List<String[]> thingsToWrite, String fileName){
        try (FileWriter writer = new FileWriter(fileName)){
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if(i < (strings.length-1))
                        writer.append(";");
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
