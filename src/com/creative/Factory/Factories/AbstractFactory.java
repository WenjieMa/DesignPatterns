package com.creative.Factory.Factories;

import com.creative.Factory.Pizzas.AbstractPizza;

/**
 * Created by xiaoma on 2017/10/15.
 */
public abstract class AbstractFactory {
    abstract AbstractPizza createPizza(String type);
    public AbstractPizza orderPizza(String type){
        AbstractPizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    };
}
