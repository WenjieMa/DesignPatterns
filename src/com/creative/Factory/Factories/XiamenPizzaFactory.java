package com.creative.Factory.Factories;

import com.creative.Factory.Pizzas.AbstractPizza;
import com.creative.Factory.Pizzas.HunanPizza;
import com.creative.Factory.Pizzas.XiamenPizza;

/**
 * Created by xiaoma on 2017/10/15.
 */
public class XiamenPizzaFactory extends AbstractFactory{
    public AbstractPizza createPizza(String type){
        switch (type) {
            case "cheese":
                System.out.println("准备厦门cheesePizza");
                return new XiamenPizza("cheese");
            case "noCheese":
                System.out.println("准备厦门pizza");
                return new XiamenPizza("noCheese");
            default:
                return new XiamenPizza("Error");
        }
    }
}
