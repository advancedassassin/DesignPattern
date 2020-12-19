package decorator.targetObj;

import java.math.BigDecimal;

/**
 * @ClassName Espresso
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 18:45
 * @Version 1.0
 **/
public class Espresso extends Coffee {

    public Espresso(){
        this.setDesc(" 意大利咖啡 ");
        this.setPrice(new BigDecimal(6));
    }

}
