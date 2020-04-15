package com.letchic;

import com.letchic.list.TestList;
import com.letchic.map.TestMap;
import com.letchic.set.TestSet;

public class Main {
    public static void main(String[] args) {
        TestData testList = new TestList();
        TestData testSet = new TestSet();
        TestData testMap = new TestMap();

        testList.getData();
        testSet.getData();
        testMap.getData();
    }
}
