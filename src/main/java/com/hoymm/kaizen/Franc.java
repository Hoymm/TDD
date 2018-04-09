package com.hoymm.kaizen;

public class Franc extends Money {
    Franc(int amount) {
        super(amount);
    }

    Money times (int multipler){
        return new Franc(amount * multipler);
    }
}
