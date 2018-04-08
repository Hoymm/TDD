package com.hoymm.kaizen;

public class Currency {
    private int amount;

    Currency(int amount){
        this.amount = amount;
    }

    Currency times (int multipler){
        return new Currency(amount * multipler);
    }

    @Override
    public boolean equals(Object object){
        return amount == ((Currency)object).amount;
    }
}
