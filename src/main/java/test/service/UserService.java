package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.UserDao;

@Service
public class UserService {

    UserDao userDao;

    @Autowired
    public void SetUserDao(UserDao userDao) {

        this.userDao = userDao;

    }

    public boolean hasMatch(String userName, String password) {

        System.out.print("service");
        System.out.print("userName:" + userName);
        System.out.print("service:" + password);

        int count = userDao.VaildUser(userName, password);


        return count > 0;
    }

}
