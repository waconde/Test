package DesignPatterns.singlePattern;

/**
 * @author zhangke
 * @version 1.0
 * @className SingleDemo
 * @description TODO
 * @date 2019/2/19 下午8:23
 **/
/*
设计模式单例模式：解决一个类在内存中之存在一个对象。
保证对象的唯一性，
1：为了避免其他程序过多的奖励对象，先禁止其他程序奖励该类对象。
2：为了让其他程序你可以访问到该类对象，，只好在本类中，自定义一个对象
3:为了方便其他程序对自定义对象的访问，可以对外提供一些访问对象。
三部实现代码：
1将构造函数私有化
2在类中创建一个本类对象
3 提供一个方法可以获取你该对象
需当需要对象唯一时，才需要用到单例模式
* */

public class SingleDemo {
    public static  void main(String []args){
        //Singleton1 s1 = new Singleton1();
        Singleton1 s1=Singleton1.getInstance();
        Singleton1 s2=Singleton1.getInstance();
        s1.setAge(18);
        System.out.print(s2.getAge());
    }
}
//饿汉式
class Singleton1 {
    private int age;
    public  void setAge( int age ){
        this.age=age;
    }
    public  int  getAge(){
        return age;
    }
    //1将构造函数私有化
    private Singleton1(){}//私有化不能new创建对象
    //2在类中创建一个本类对象
    private static  Singleton1 s=new Singleton1();
    //3提供一个方法可以获取你该对象
    public static  Singleton1 getInstance(){
        return  s;
    }
}
class Student {
    private int age;
    public  void setAge( int age ){
        this.age=age;
    }
    public  int  getAge(){
        return age;
    }
    //1将构造函数私有化，特殊学生
    private Student(){}//私有化不能new创建对象
    //2在类中创建一个本类对象
    private static  Student s=new Student();
    //3提供一个方法可以获取你该对象
    public static  Student getInstance(){
        return  s;
    }
}

//静态内部类的形式操作。
class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/*Effective Java 第二版推荐写法

public enum SingleInstance {
 INSTANCE;
 public void fun1() {
     // do something
 }
}

//使用
SingleInstance.INSTANCE.fun1();
*/




