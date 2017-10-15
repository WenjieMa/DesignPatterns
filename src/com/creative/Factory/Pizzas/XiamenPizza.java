package com.creative.Factory.Pizzas;

/**
 * Created by xiaoma on 2017/10/15.
 */
public class XiamenPizza extends AbstractPizza{
    public XiamenPizza(String type){
        name="厦门Pizza"+type;
    }

    public void cut(){
        System.out.println("切成方块");
    }
}
