package com.hoymm.kaizen;

interface Expression {
    Money reduce(Bank bank, String to);
}
