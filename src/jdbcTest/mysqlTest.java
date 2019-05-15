package jdbcTest;




import java.sql.*;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlTest
 * @description TODO 测试 mysql8的连接
 * @date 2019/4/19 3:20 PM
 **/
public class mysqlTest {
    public static  void main(String [] args){

        String driver = "com.mysql.cj.jdbc.Driver";// 数据库驱动
        String url = "jdbc:mysql://172.24.8.133:3306/data_service?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Hongkong";// **指的是数据库名称
        String username = "root";// 数据库用户名
        String password = "1qaz@WSX";// 数据库密码
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);// 加载数据库驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);// 连接Connection对象
            stat = (Statement) conn.createStatement();// 创建Statement对象
            String sql = "select * from t_product";
            rs = stat.executeQuery(sql);// 执行sql语句返回结果集
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}