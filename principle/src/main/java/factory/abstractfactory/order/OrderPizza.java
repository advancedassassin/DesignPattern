package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

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


    // 构造器
    public OrderPizza(PizzaAbstractFactory pizzaAbstractFactory) throws IOException {
        setPizzaFactory(pizzaAbstractFactory);
    }

    private void setPizzaFactory(PizzaAbstractFactory pizzaAbstractFactory) throws IOException {
        Pizza pizza = null;

        String orderType = "";// pizza订购类型

        do {
            orderType = getType();
            pizza = pizzaAbstractFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.package1();
            }else {
                System.out.println("未获取到该种类Pizza！，退出订购！！！");
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
