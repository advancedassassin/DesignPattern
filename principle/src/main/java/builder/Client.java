package builder;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/26 20:39
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
