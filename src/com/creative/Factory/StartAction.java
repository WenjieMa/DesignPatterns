package com.creative.Factory;

import com.creative.Factory.Factories.AbstractFactory;
import com.creative.Factory.Factories.HunanPizzaFactory;
import com.creative.Factory.Factories.XiamenPizzaFactory;
import com.creative.Factory.Pizzas.AbstractPizza;

/**
 * Created by xiaoma on 2017/10/15.
 */
public class StartAction {
    public static void main(String[] args){
        AbstractFactory factory1=new HunanPizzaFactory();
        AbstractFactory factory2=new XiamenPizzaFactory();

        AbstractPizza pizza1= factory1.orderPizza("cheese");
        System.out.println(pizza1.getName());
        AbstractPizza pizza2= factory2.orderPizza("noCheese");
        System.out.println(pizza2.getName());
    }
}
