package com.hoymm.kaizen;

public class Franc extends Money {
    Franc(int amount) {
        super(amount);
        currency = "CHF";
    }

    Money times (int multipler){
        return new Franc(amount * multipler);
    }
}
