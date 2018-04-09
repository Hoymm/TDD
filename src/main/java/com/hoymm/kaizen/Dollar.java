package com.hoymm.kaizen;

class Dollar extends Money {
    Dollar(int amount, String currency){
        super(amount, currency);
    }

    Money times (int multipler){
        return Money.dollar(amount * multipler);
    }
}
