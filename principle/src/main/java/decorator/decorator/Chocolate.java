package decorator.decorator;

import decorator.Drink;

import java.math.BigDecimal;

/**
 * @ClassName Chocolate
 * @Description 具体的Decorator巧克力调料
 * @Author Duxin Yuan
 * @Date 2020/12/19 18:57
 * @Version 1.0
 **/
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc(" 巧克力 ");
        setPrice(new BigDecimal(3));// 巧克力调料价格
    }
}
