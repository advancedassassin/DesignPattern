package builder.improve;

/**
 * @ClassName HouseDirector
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/27 0:17
 * @Version 1.0
 **/
public class HouseDirector {
    // HouseBuilder聚合到HouseDirector
    HouseBuilder houseBuilder;

    // 构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    // 通过setter 传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
