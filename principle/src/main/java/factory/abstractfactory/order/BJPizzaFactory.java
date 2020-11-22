package factory.abstractfactory.order;

import factory.abstractfactory.pizza.BJCheesePizza;
import factory.abstractfactory.pizza.BJPepperPizza;
import factory.abstractfactory.pizza.Pizza;

/**
 * @ClassName BJPizzaFactory
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 20:26
 * @Version 1.0
 **/
public class BJPizzaFactory implements PizzaAbstractFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
