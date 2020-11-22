package factory.simplefactory.before.order;

import factory.simplefactory.before.pizza.CheesePizza;
import factory.simplefactory.before.pizza.GreekPizza;
import factory.simplefactory.before.pizza.Pizza;

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

    public OrderPizza() throws IOException {
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
    }

    private String getType() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入Pizza种类...");
        String str = bufferedReader.readLine();
        return str;
    }

}
