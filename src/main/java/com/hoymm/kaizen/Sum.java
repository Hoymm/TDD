package com.hoymm.kaizen;

public class Sum implements Expression{

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    Money augend;
    Money addend;
}
