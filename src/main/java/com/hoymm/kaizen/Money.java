package com.hoymm.kaizen;

class Money implements Expression{
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money)object;
        boolean currencyEquality = currency().equals(money.currency());
        boolean amountEquality = amount == money.amount;
        return currencyEquality && amountEquality;
    }

    Money times (int multipler){
        return new Money(amount * multipler, currency);
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    String currency(){
        return currency;
    }

    Expression plus(Money addend){
        return new Sum(this, addend);
    }

    @Override
    public String toString(){
        return amount + " " + currency;
    }
}
