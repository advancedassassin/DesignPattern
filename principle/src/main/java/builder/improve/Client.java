package builder.improve;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/27 15:57
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();

        System.out.println(house);

        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        House house1 = houseDirector.constructHouse();

        System.out.println(house1);
    }
}
