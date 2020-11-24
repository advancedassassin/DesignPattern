package prototype.shallowclone;

/**
 * @ClassName Sheep
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 10:54
 * @Version 1.0
 **/
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private String color;

    public Sheep friend;// 成员变量有个对象，看常规克隆会怎么处理

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep)super.clone();
        return sheep;
    }
}
