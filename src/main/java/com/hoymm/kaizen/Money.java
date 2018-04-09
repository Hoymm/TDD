package com.hoymm.kaizen;

public class Money {
    protected int amount;

    Money(int amount){
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object){
        boolean classEquality = getClass().equals(object.getClass());
        boolean amountEquality = amount == ((Money)object).amount;
        return classEquality && amountEquality;
    }
}
