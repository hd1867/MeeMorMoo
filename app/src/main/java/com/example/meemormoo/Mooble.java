package com.example.meemormoo;

public class Mooble implements Item{

    private Currency value;

    public Mooble(Currency value){
        this.value = value;
    }

    @Override
    public Currency getValue() {
        return value;
    }
}
