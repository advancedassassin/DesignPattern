package decorator.decorator;

import decorator.Drink;

import java.math.BigDecimal;

/**
 * @ClassName Decorator
 * @Description 装饰者类，仍然需要继承基类
 * @Author Duxin Yuan
 * @Date 2020/12/19 18:48
 * @Version 1.0
 **/
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        // 这里体现了组合
        this.drink = drink;
    }

    @Override
    public BigDecimal cost() {
        // getPrice装饰者（调料）自己的价格，drink.cost()是单品咖啡的价格
        BigDecimal decoratorPrice = super.getPrice();
        BigDecimal allCost = drink.cost();

        return decoratorPrice.add(allCost);
    }


    @Override
    public String getDesc(){
        // drink.getDesc()是被装饰者描述信息,
        // super.getDesc()是调料父類的描述，
        // getPrice（）同super.getPrice()是调料的单价
        return "调料描述-" + super.getDesc()+ ";调料单价" + getPrice()+ ";目前已有饮料描述" + drink.getDesc();
    }
}
