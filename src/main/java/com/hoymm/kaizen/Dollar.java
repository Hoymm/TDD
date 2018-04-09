package com.hoymm.kaizen;

class Dollar extends Money {
    Dollar(int amount, String currency){
        super(amount);
        this.currency = currency;
    }

    Money times (int multipler){
        return Money.dollar(amount * multipler);
    }
}
