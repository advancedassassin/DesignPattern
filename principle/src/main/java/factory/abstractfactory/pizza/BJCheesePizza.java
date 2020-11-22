package factory.abstractfactory.pizza;

/**
 * @ClassName CheesePizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:26
 * @Version 1.0
 **/
public class BJCheesePizza extends Pizza {

    public void prepare() {
        setName("北京起司披萨");
        System.out.println("北京起司披萨准备原材料");
    }
}
