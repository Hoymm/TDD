package com.hoymm.kaizen;

public class Franc {
    private int amount;

    Franc(int amount){
        this.amount = amount;
    }

    Franc times (int multipler){
        return new Franc(amount * multipler);
    }

    @Override
    public boolean equals(Object object){
        return amount == ((Franc)object).amount;
    }
}
