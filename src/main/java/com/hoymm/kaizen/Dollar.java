package com.hoymm.kaizen;

class Dollar extends Money {
    Dollar(int amount){
        super(amount);
        currency = "USD";
    }

    Money times (int multipler){
        return new Dollar(amount * multipler);
    }
}
