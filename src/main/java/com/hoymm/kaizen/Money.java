package com.hoymm.kaizen;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object){
        boolean classEquality = getClass().equals(object.getClass());
        boolean amountEquality = amount == ((Money)object).amount;
        return classEquality && amountEquality;
    }

    abstract Money times(int multipler);

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    String currency(){
        return currency;
    }
}
