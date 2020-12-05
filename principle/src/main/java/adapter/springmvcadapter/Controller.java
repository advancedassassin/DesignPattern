package adapter.springmvcadapter;

/**
 * @InterfaceName Controller
 * @Description Controller接口及其实现类
 * @Author Duxin Yuan
 * @Date 2020/12/5 22:00
 * @Version 1.0
 **/
public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("doHttpHandler...");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("doSimpleHandler...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("doAnnotationHandler...");
    }
}