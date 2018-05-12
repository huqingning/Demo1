import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class MyTest1 {

    private Connection conn =null;

    @Before
    public void setUp(){
        String url = "jdbc:mysql://localhost:3306/test" ;
        String username = "root" ;
        String password = "123456" ;
        try{
            //加载MySql的驱动类
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url , username , password );
        }catch(Exception e){
            e.printStackTrace() ;
        }
    }

    @Test
    public void test() throws Exception{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next()){
            String name = rs.getString("name") ;
//            String pass = rs.getString(1) ; // 此方法比较高效
            System.out.println(name);
        }
    }
}
