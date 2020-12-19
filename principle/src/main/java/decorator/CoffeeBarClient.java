package decorator;

import decorator.decorator.Chocolate;
import decorator.decorator.Milk;
import decorator.targetObj.Decaf;

import java.math.BigDecimal;

/**
 * @ClassName CoffeeBarClient
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 19:02
 * @Version 1.0
 **/
public class CoffeeBarClient {

    public static void main(String[] args) {
        // 装饰者模式下，佐料两份巧克力+一份牛奶，单品Decaf

        // 1、单点一份Decaf
        Drink order  = new Decaf();
        BigDecimal cost1 = order.cost();
        System.out.println("单点一份Decaf总价："+cost1);
        BigDecimal price1 = order.getPrice();
        System.out.println("单点一份Decaf单价："+price1);
        String desc1 = order.getDesc();
        System.out.println("单点一份Decaf描述信息："+order.getDesc());

        // 2、加牛奶佐料
        order = new Milk(order);
        BigDecimal cost2 = order.cost();
        System.out.println("加牛奶佐料后总价："+cost2);
        BigDecimal price2 = order.getPrice();
        System.out.println("加牛奶佐料后单价："+price2);
        String desc2 = order.getDesc();
        System.out.println("加牛奶佐料描述信息："+desc2);

        // 3、加入佐料巧克力
        order = new Chocolate(order);
        BigDecimal cost3 = order.cost();
        System.out.println("加巧克力佐料后总价："+cost3);
        BigDecimal price3 = order.getPrice();
        System.out.println("加巧克力佐料后单价："+price3);
        String desc3 = order.getDesc();
        System.out.println("加巧克力佐料描述信息："+desc3);

        // 4、加入佐料巧克力
        order = new Chocolate(order);
        BigDecimal cost4 = order.cost();
        System.out.println("加巧克力2佐料后总价："+cost4);
        BigDecimal price4 = order.getPrice();
        System.out.println("加巧克力2佐料后单价："+price4);
        String desc4 = order.getDesc();
        System.out.println("加巧克力2佐料描述信息："+desc4);
    }

}
