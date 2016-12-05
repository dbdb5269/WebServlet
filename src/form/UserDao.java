package form;

import java.util.List;

/**
 * Created by dubo on 16/12/1.
 */
public interface UserDao {
    public void SavaUser(User user) throws Exception;
    public User find(String name) throws Exception;
    public List<User> findAllUser() throws Exception;
}
