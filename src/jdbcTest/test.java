package jdbcTest;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author zhangke
 * @version 1.0
 * @className test
 * @description TODO 测试阿里云数据库的时候能正常连接
 * @date 2019/3/21 下午2:36
 **/
public class test {
    public static  void main(String [] args){

        String driver = "com.mysql.jdbc.Driver";// 数据库驱动
        String url = "jdbc:mysql://47.105.165.247:3306/crm";// **指的是数据库名称
        String username = "root";// 数据库用户名
        String password = "ZhangKe123!";// 数据库密码
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);// 加载数据库驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);// 连接Connection对象
            stat = (Statement) conn.createStatement();// 创建Statement对象
            String sql = "select * from customer";
            rs = stat.executeQuery(sql);// 执行sql语句返回结果集
            while (rs.next()) {
                System.out.println(rs.getInt("cust_id"));
                System.out.println(rs);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}