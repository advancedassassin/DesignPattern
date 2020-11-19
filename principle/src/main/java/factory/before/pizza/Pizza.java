package factory.before.pizza;

/**
 * @ClassName Pizza
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/19 15:21
 * @Version 1.0
 **/
public abstract class Pizza {

    protected String name;

    // 准备原材料，不同的披萨不一样，因此，做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "烘烤中;");
    }

    public void cut(){
        System.out.println(name + "切盘中;");
    }

    public void package1(){
        System.out.println(name + "打包中;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
