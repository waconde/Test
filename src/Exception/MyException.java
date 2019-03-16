package Exception;

/**
 * @author zhangke
 * @version 1.0
 * @className MyException
 * @description TODO 自定义异常类
 * @date 2019/1/14 下午4:27
 **/
class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}