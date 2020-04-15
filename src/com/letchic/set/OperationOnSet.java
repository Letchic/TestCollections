package com.letchic.set;

import java.util.Set;

@FunctionalInterface
public interface OperationOnSet<Object> {
    void run(Set<Object> set, Object object);
}