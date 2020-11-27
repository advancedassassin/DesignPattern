package builder.improve;

/**
 * @ClassName HouseBuilder
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/27 0:09
 * @Version 1.0
 **/
public abstract class HouseBuilder {

    House house = new House();

    // 建造的流程
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 建好的房子，将产品返回
    public House buildHouse(){
        return house;
    }
}
