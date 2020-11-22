package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

/**
 * @InterfaceName AbstractFactory
 * @Description 披萨抽象工厂模式
 * @Author Duxin Yuan
 * @Date 2020/11/22 20:24
 * @Version 1.0
 **/
public interface PizzaAbstractFactory {

    public abstract Pizza createPizza(String orderType);

}
