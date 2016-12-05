package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubo on 16/12/1.
 */
public class UserDaoImp implements UserDao {
    private static final long serialVersionUID = 1L;
    private static String url="jdbc:oracle:thin:@10.211.55.3:1521:xe";
    private static String driver="oracle.jdbc.driver.OracleDriver";
    private static String user="briup";
    private static String password="briup";
    private static Connection connection=null;
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connection="+connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void SavaUser(User user) throws Exception {
        String sql="insert into u values(user_id.nextval,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3,user.getGender());
        preparedStatement.setInt(4,user.getAge());
        preparedStatement.setString(5,user.getJob());
        preparedStatement.executeUpdate();
        preparedStatement.close();


    }

    @Override
    public User find(String name) throws Exception {
        String sql="select * from u where name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();

        User user=null;
        while (resultSet.next()){
            user=new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(5),resultSet.getString(4),resultSet.getString(6));


        }
        return user;

    }

    @Override
    public List<User> findAllUser() throws Exception {
        String sql="select * from u where 1=1";
        List<User> list=new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user=null;
        while (resultSet.next()){

            user=new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(5),resultSet.getString(4),resultSet.getString(6));
            list.add(user);


        }
        System.out.println("list="+list);
        return list;
    }
}
