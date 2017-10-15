package com.creative.Factory.Pizzas;

/**
 * Created by xiaoma on 2017/10/15.
 */
public abstract class AbstractPizza {
    String name;

    public void prepare(){
        System.out.println("Prepare"+name);
    }

    public void bake(){
        System.out.println("bake");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void box(){
        System.out.println("box");
    }

    public String getName(){
        return name;
    }
}
