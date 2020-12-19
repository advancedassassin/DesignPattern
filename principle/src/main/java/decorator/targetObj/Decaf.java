package decorator.targetObj;

import java.math.BigDecimal;

/**
 * @ClassName Decaf
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 18:47
 * @Version 1.0
 **/
public class Decaf extends Coffee {
    public Decaf(){
        this.setDesc(" 迪卡福咖啡 ");
        this.setPrice(new BigDecimal(5));
    }
}
