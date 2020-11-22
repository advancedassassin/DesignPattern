package factory.simplefactory.post.order;

import factory.simplefactory.post.pizza.CheesePizza;
import factory.simplefactory.post.pizza.GreekPizza;
import factory.simplefactory.post.pizza.PepperPizza;
import factory.simplefactory.post.pizza.Pizza;

/**
 * @ClassName Pizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 16:06
 * @Version 1.0
 **/
public class PizzaSimpleFactory {
    // 根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式PizzaSimpleFactory");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek-pizza");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese-pizza");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("pepper-pizza");
        }
        return pizza;
    }

}
