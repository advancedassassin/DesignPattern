package factory.before.pizza;

/**
 * @ClassName CheesePizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:26
 * @Version 1.0
 **/
public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("起司披萨准备原材料");
    }
}
