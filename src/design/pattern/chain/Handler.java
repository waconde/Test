package design.pattern.chain;

/**
 * @author zhangke
 * @version 1.0
 * @className Handler
 * @description TODO 链式调用模式
 * @date 2019/3/17 上午11:41
 **/
public abstract class Handler {
    private  Handler sucessor;

    public Handler getSucessor() {
        return sucessor;
    }

    public Handler(Handler sucessor) {
        this.sucessor = sucessor;

    }
    public void execute(){
        handlerProcess();
        if(sucessor!=null){
            sucessor.execute();
        }
    }

    protected  abstract void handlerProcess();

}