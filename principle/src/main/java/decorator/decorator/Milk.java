package decorator.decorator;

import decorator.Drink;

import java.math.BigDecimal;

/**
 * @ClassName Milk
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 19:01
 * @Version 1.0
 **/
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc(" 牛奶 ");
        setPrice(new BigDecimal( "2" ));
    }
}
