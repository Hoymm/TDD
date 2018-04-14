package com.hoymm.kaizen;
import java.util.HashMap;
import java.util.Map;

class Fibonacci {
    private Map<Integer, Long> fibIndexToValue;

    Fibonacci() {
        fibIndexToValue = new HashMap<>();
    }

    long getValueOf(int i) {
        if (i < 0)
            throw new IllegalArgumentException("Number element must be higher or equal to zero, you passed: " + i);
        if (!fibIndexToValue.containsKey(i))
            addNewValueToMap(i);
        return fibIndexToValue.get(i);
    }

    private void addNewValueToMap(int i) {
        if (i == 0)
            fibIndexToValue.put(0, 0L);
        else if (i == 1)
            fibIndexToValue.put(1, 1L);
        else
            fibIndexToValue.put(i, getValueOf(i-1)+getValueOf(i-2));
    }
}
