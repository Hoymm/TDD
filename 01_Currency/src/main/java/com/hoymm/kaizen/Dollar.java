package com.hoymm.kaizen;

class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times (int multipler){
        return new Dollar(amount * multipler);
    }

    @Override
    public boolean equals(Object object){
        return amount == ((Dollar)object).amount;
    }
}
