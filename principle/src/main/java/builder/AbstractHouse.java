package builder;

/**
 * @ClassName AbstractHouse
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/26 20:30
 * @Version 1.0
 **/
public abstract class AbstractHouse {

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildRoof();

    public void build(){
        buildBase();
        buildWall();
        buildRoof();
    }
}
