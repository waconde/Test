package Algorithm.zhangke.innerclass;

/**
 * @author zhangke
 * @version 1.0
 * @className Company
 * @description TODO
 * @date 2019/3/9 下午4:44
 **/
/*
 * 静态内部类
 */
public class Company {
    private static String info="Hello World";
    String companyNam;
    static String country;
    public static void main(String[] args) {
        Company.Clear zcl=new Company.Clear();
        zcl.work("shen_hua");
    }
    /**
     静态内部类不会持有外部类的引用
     静态内部类可以访问外部的静态变量，如果访问外部类的成员变量必须通过外部类的实例访问
     **/
    static class Clear{
        String name;
        public Clear() {
            // TODO Auto-generated constructor stub
        }

        public Clear(String name) {
            super();
            this.name = name;
        }
        public void work(String name){
            String na=new Company().companyNam="联想";
            country="中国";
            System.out.println(name+"为"+na+"打扫卫生，该公司属于"+country);
            //静态内部类可以访问外部的静态变量
            System.out.println(info);
        }

    }

}