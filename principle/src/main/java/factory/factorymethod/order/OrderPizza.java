package factory.factorymethod.order;

import factory.factorymethod.pizza.Pizza;

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
public abstract class OrderPizza {

    // 定义个抽象方法，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderPizza);

    // 构造器
    public OrderPizza() throws IOException {
        Pizza pizza = null;

        String orderType = "";// pizza订购类型

        do {
            orderType = getType();
            pizza = createPizza(orderType);// 抽象方法，由工厂子类完成
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
