package factory.factorymethod.order;

import factory.factorymethod.pizza.BJCheesePizza;
import factory.factorymethod.pizza.BJPepperPizza;
import factory.factorymethod.pizza.Pizza;

import java.io.IOException;

/**
 * @ClassName BJOrderPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 18:56
 * @Version 1.0
 **/
public class BJOrderPizza extends OrderPizza {
    public BJOrderPizza() throws IOException {
    }

    Pizza createPizza(String orderType) {

        factory.factorymethod.pizza.Pizza pizza = null;

        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
