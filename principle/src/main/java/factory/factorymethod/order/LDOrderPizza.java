package factory.factorymethod.order;

import factory.factorymethod.pizza.*;

import java.io.IOException;

/**
 * @ClassName BJOrderPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 18:56
 * @Version 1.0
 **/
public class LDOrderPizza extends OrderPizza {
    public LDOrderPizza() throws IOException {
    }

    Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        }else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
