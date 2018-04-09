package com.hoymm.kaizen;

class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount);
        this.currency = currency;
    }

    Money times (int multipler){
        return Money.franc(amount * multipler);
    }
}
