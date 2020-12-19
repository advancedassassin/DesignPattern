package decorator.targetObj;

import decorator.Drink;

import java.math.BigDecimal;

/**
 * @ClassName Coffee
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 18:14
 * @Version 1.0
 **/
public class Coffee extends Drink {
    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }
}
