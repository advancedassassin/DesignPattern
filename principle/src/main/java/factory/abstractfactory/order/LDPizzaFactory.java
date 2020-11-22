package factory.abstractfactory.order;

import factory.abstractfactory.pizza.*;
import factory.simplefactory.post.pizza.PepperPizza;

/**
 * @ClassName BJPizzaFactory
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 20:26
 * @Version 1.0
 **/
public class LDPizzaFactory implements PizzaAbstractFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        }else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
