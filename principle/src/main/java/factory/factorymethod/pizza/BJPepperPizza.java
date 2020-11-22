package factory.factorymethod.pizza;

/**
 * @ClassName PepperPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 20:35
 * @Version 1.0
 **/
public class BJPepperPizza extends Pizza {
    public void prepare() {
        setName("北京辣椒披萨");
        System.out.println("北京辣椒披萨准备原材料");
    }
}
