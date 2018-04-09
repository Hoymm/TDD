package com.hoymm.kaizen;

abstract class Money {
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

    abstract Money times(int multipler);

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    static Money franc(int amount){
        return new Franc(amount);
    }
}
