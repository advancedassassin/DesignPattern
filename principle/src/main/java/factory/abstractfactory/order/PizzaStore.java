package factory.abstractfactory.order;

import factory.simplefactory.post.order.PizzaSimpleFactory;

import java.io.IOException;

/**
 * @ClassName PizzaStore
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:42
 * @Version 1.0
 **/
public class PizzaStore {

    public static void main(String[] args) throws IOException {

//        new OrderPizza(new LDPizzaFactory());
        new OrderPizza(new BJPizzaFactory());

    }

}
