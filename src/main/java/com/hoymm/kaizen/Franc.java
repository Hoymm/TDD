package com.hoymm.kaizen;

class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times (int multipler){
        return Money.franc(amount * multipler);
    }
}
