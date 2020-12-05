package adapter.springmvcadapter;

/**
 * @ClassName HandlerAdapter
 * @Description Adapter接口和
 * @Author Duxin Yuan
 * @Date 2020/12/5 22:03
 * @Version 1.0
 **/
public interface HandlerAdapter {

    boolean supports(Object handler);

    void handler(Object handler);

}

class HttpHandlerAdapter implements  HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}


class AnnotatiionHandlerAdapter implements  HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}

class SimpleHandlerAdapter implements  HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}