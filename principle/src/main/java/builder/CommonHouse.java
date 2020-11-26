package builder;

/**
 * @ClassName CommonHouse
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/26 20:38
 * @Version 1.0
 **/
public class CommonHouse extends AbstractHouse {
    public void buildBase() {
        System.out.println("普通房子修地基");
    }

    public void buildWall() {
        System.out.println("普通房子修墙");
    }

    public void buildRoof() {
        System.out.println("普通房子封顶");
    }
}
