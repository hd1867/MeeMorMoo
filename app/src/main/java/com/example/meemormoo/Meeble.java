package com.example.meemormoo;

public class Meeble implements Item{

    private Currency value;

    public Meeble(Currency value){
        this.value = value;
    }

    @Override
    public Currency getValue() {
        return value;
    }
}
