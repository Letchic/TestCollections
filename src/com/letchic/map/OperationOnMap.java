package com.letchic.map;

import java.util.Map;

@FunctionalInterface
public interface OperationOnMap< Object> {
    void run(Map <Integer,Object> map, Integer key, Object object);
}