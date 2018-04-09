package com.hoymm.kaizen;

class Dollar extends Money {
    private String currency;
    Dollar(int amount){
        super(amount);
        currency = "USD";
    }

    Money times (int multipler){
        return new Dollar(amount * multipler);
    }

    @Override
    String currency(){
        return currency;
    }
}
