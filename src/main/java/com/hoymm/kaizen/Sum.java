package com.hoymm.kaizen;

class Sum implements Expression{

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    Money augend;
    Money addend;

    Money reduce(String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
