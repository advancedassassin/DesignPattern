package prototype.shallowclone;

import prototype.shallowclone.Sheep;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 10:56
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 传统方式
        Sheep sheep = new Sheep("Dolly", 1, "red");

        sheep.setFriend(new Sheep("Tom",2,"black"));

        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();

        System.out.println("sheep="+sheep+"sheep.friend="+sheep.friend.hashCode());
        System.out.println("sheep1="+sheep1+"sheep1.friend="+sheep1.friend.hashCode());
        System.out.println("sheep2="+sheep2+"sheep2.friend="+sheep2.friend.hashCode());
        System.out.println("sheep3="+sheep3+"sheep3.friend="+sheep3.friend.hashCode());
    }

}
