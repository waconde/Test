package fanxing.nei;

/**
 * @author zhangke
 * @version 1.0
 * @className student
 * @description TODO
 * @date 2019/2/23 上午12:10
 **/
public class Student {
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}