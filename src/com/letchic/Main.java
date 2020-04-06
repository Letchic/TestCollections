package com.letchic;

import com.letchic.list.TestList;
import com.letchic.map.TestMap;
import com.letchic.set.TestSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************************** List test *****************************");
        TestList.testAdd();
        TestList.testAddtoHead();
        TestList.testAddtoMid();
        TestList.testGet();
        TestList.testSet();
        TestList.testRemove();
        TestList.testRemovehead();
        System.out.println("*********************************************************************");

        System.out.println("***************************** Set test *****************************");
        TestSet.testAdd();
        TestSet.testRemove();
        System.out.println("*********************************************************************");

        System.out.println("***************************** Map test *****************************");
        TestMap.testPut();
        TestMap.testGet();
        TestMap.testRemove();
        System.out.println("*********************************************************************");
    }
}
