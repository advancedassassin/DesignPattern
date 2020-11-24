package prototype.before;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 10:56
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 传统方式
        Sheep sheep = new Sheep("Dolly", 1, "red");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }

}
