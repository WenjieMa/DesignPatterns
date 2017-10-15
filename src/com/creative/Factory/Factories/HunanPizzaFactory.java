package com.creative.Factory.Factories;

import com.creative.Factory.Pizzas.HunanPizza;

/**
 * Created by xiaoma on 2017/10/15.
 */
public class HunanPizzaFactory extends AbstractFactory {
    public HunanPizza createPizza(String type) {
        switch (type) {
            case "cheese":
                System.out.println("准备湖南cheesePizza");
                return new HunanPizza("cheese");
            case "noCheese":
                System.out.println("准备湖南pizza");
                return new HunanPizza("noCheese");
            default:
                return new HunanPizza("Error");
        }

    }
}
