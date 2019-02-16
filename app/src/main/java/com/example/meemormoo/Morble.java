package com.example.meemormoo;

public class Morble implements Item{

    private Currency value;

    public Morble(Currency value){
        this.value = value;
    }

    @Override
    public Currency getValue() {
        return value;
    }
}
