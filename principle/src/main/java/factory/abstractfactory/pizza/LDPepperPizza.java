package factory.abstractfactory.pizza;

/**
 * @ClassName PepperPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 20:35
 * @Version 1.0
 **/
public class LDPepperPizza extends Pizza {
    public void prepare() {
        setName("伦敦辣椒披萨");
        System.out.println("伦敦辣椒披萨准备原材料");
    }
}
