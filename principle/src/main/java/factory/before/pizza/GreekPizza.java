package factory.before.pizza;

/**
 * @ClassName GreekPizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:31
 * @Version 1.0
 **/
public class GreekPizza extends Pizza  {
    public void prepare() {
        System.out.println("希腊披萨准备原材料");
    }
}
