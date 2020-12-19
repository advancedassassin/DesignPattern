package decorator;

import java.math.BigDecimal;

/**
 * @ClassName Drink
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/19 17:57
 * @Version 1.0
 **/
public abstract class Drink {

    // 描述
    private String desc;

    private BigDecimal price = new BigDecimal(0);

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    // 计算费用的抽象方法计算，子类实现
    public abstract BigDecimal cost();
}
