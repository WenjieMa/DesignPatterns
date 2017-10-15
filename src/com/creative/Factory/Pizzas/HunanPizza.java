package com.creative.Factory.Pizzas;

/**
 * Created by xiaoma on 2017/10/15.
 */
public class HunanPizza extends AbstractPizza{
    public HunanPizza(String type){
        name=type+"湖南Pizza";
    }

    public void bake(){
        System.out.println("烤的比较焦");
    }
}
