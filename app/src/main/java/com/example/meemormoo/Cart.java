package com.example.meemormoo;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {

    int size;
    HashMap contents;
    Currency totalVal;

    public Cart(){
        size = 0;
        contents = new HashMap();
        totalVal = Currency.ZERO;
    }

    //add specified item to the cart
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void add(Item item){
        if(contents.containsKey(item)){
            contents.replace(item, (int)contents.get(item) + 1);
        }
        else{
            contents.put(item, 1);
        }
        totalVal = totalVal.add(item.getValue());
        size ++;
    }

    //removes the specified item from the cart
    public void remove(Item item){
        assert contents.containsKey(item);
        if((int)contents.get(item) == 1){
            contents.remove(item);
        }
        else{
            contents.put(item, (int)contents.get(item) - 1);
        }
        totalVal = totalVal.subtract(item.getValue());
        size --;
    }

    // Clears the cart's contents
    public void clear(){
        for ( Object key: contents.keySet()) {
            size -= (int)contents.get(key);
            contents.remove(key);
        }
    }

}
