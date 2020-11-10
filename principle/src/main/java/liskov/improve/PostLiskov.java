package liskov.improve;

/**
 * @ClassName PostLiskov
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/10 17:01
 * @Version 1.0
 **/
public class PostLiskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.minus(11,3));
        System.out.println("1-8="+a.minus(1,8));


        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11+3="+b.minus(11,3));
        System.out.println("1+8="+b.minus(1,8));
        System.out.println("11+3+9="+b.add9(11,3));
    }
}

class Base{

}

class A extends Base {
    public int minus(int p1, int p2){
        return p1 -p2;
    }
}

class B extends Base {

    public int minus(int p1, int p2){
        return p1 + p2;
    }

    public int add9(int p1, int p2){
        return minus(p1, p2) + 9;
    }
}