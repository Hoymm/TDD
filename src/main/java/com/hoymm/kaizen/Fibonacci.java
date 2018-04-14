package com.hoymm.kaizen;

class Fibonacci {
    int getValueOf(int i) {
        if (i <= 0)
            return 0;
        else if (i == 1)
            return 1;
        return getValueOf(i-1)+getValueOf(i-2);
    }
}
