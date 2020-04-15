package com.letchic.list;

import java.util.List;

@FunctionalInterface
public interface OperationOnList<Object> {
    void run(List<Object> list, Object object);
}