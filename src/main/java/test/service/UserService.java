package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.UserDao;
import test.entity.User;

@Service
public class UserService {

    UserDao userDao;

    @Autowired
    public void SetUserDao(UserDao userDao) {

        this.userDao = userDao;

    }

    public boolean hasMatch(String userName, String password) {

        System.out.println("service");
        System.out.println("userName:" + userName);
        System.out.println("service:" + password);

        int count = userDao.VaildUser(userName, password);

        System.out.println("查询信息：" + count);

        return count > 0;
    }

    public User getUserInfo(String userName, String password) {

        User user = userDao.GetUserInfo(userName, password);

        return user;
    }

}
