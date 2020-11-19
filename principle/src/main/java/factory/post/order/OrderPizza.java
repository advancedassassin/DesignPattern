package factory.post.order;

import factory.before.pizza.CheesePizza;
import factory.before.pizza.GreekPizza;
import factory.post.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:30
 * @Version 1.0
 **/
public class OrderPizza {

    /*public OrderPizza() throws IOException {
        Pizza pizza = null;

        String orderType = "";

        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek-pizza");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese-pizza");
            } else {
                System.out.println("无该类型的pizza，结束订购！");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.package1();
        } while (true);
    }*/
    // 定义一个简单工厂对象
    PizzaSimpleFactory pizzaSimpleFactory;

    Pizza pizza = null;

    // 构造器
    public OrderPizza(PizzaSimpleFactory pizzaSimpleFactory) throws IOException {
        setFactory(pizzaSimpleFactory);
    }

    public void setFactory(PizzaSimpleFactory pizzaSimpleFactory) throws IOException {
        String orderType = "";//用户输入
        this.pizzaSimpleFactory = pizzaSimpleFactory;//设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.pizzaSimpleFactory.createPizza(orderType);
            // 输出Pizza信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.package1();
            }else {
                System.out.println(" 无该类型pizza，订购失败 ");
                break;
            }
        } while (true);
    }

    private String getType() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入Pizza种类...");
        String str = bufferedReader.readLine();
        return str;
    }

}
