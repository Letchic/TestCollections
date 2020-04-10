package com.letchic;

import com.letchic.list.TestList;
import com.letchic.map.TestMap;
import com.letchic.set.TestSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
         TestList.getDataFromList();
         TestMap.getDataFromMap();
         TestSet.getDataFromSet();
    }
}
