package builder.improve;

/**
 * @ClassName CommonHouse
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/27 0:15
 * @Version 1.0
 **/
public class CommonHouse extends HouseBuilder {
    public void buildBase() {
        System.out.println("common...buildBase");
    }

    public void buildWall() {
        System.out.println("common...buildWall");
    }

    public void buildRoof() {
        System.out.println("common...buildRoof");
    }
}
