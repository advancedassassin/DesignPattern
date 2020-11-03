package inversion;

/**
 * 依赖关系规范传递的三种方式
 */
public class DependencyInversion {

    public static void main(String[] args) {
        //  1、接口传递
        Sony sony = new Sony();
        /* OnAndOff onAndOff = new OnAndOff();
        onAndOff.open(sony);*/

        // 2、构造方法传递
        /*OnAndOff onAndOff = new OnAndOff(sony);
        onAndOff.open();*/

        // 3、setter方式传递

        OnAndOff onAndOff = new OnAndOff();
        onAndOff.setTv(sony);
        onAndOff.open();
    }


}

class Sony implements InterfaceTV{

    public void play() {
        System.out.println("Sony电视机打开了。。。");
    }
}
//  1、接口传递

/**
 * 开关接口
 */
/*interface InterfaceOnAndOff {
    public void open(InterfaceTV interfaceTV);
}
*//**
 * 电视接口
 *//*
interface InterfaceTV {
    public void play();
}

*//**
 * 实现开关接口
 *//*
class OnAndOff implements InterfaceOnAndOff{

    public void open(InterfaceTV interfaceTV) {
        interfaceTV.play();
    }
}*/



// 2、构造方法传递
/**
 * 开关接口
 */
/*interface InterfaceOnAndOff {
    public void open();
}
interface InterfaceTV {
    public void play();
}

class OnAndOff implements InterfaceOnAndOff{

    private InterfaceTV interfaceTV;

    public OnAndOff(InterfaceTV interfaceTV){
        this.interfaceTV  =  interfaceTV;
    }

    public void open() {
        this.interfaceTV.play();
    }
}*/

// 3、setter方式传递
interface InterfaceTV {
    public void play();
}


interface InterfaceOnAndOff {
    public void open();

    public void setTv(InterfaceTV interfaceTV);
}


class OnAndOff implements InterfaceOnAndOff{
    private InterfaceTV interfaceTV;

    public void open() {
        this.interfaceTV.play();
    }
    public void setTv(InterfaceTV interfaceTV) {
        this.interfaceTV = interfaceTV;
    }
}