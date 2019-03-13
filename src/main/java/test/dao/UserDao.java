package test.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import test.entity.User;

@Repository
public class UserDao {

    private final static String QUERY_USER_INFO="Select count(*) from user where username=? and password=?";

    private final static String QUERY_USER="Select * from user where username=? and password=?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    public int VaildUser(String userName, String password) {

        return jdbcTemplate.queryForObject(QUERY_USER_INFO, new Object[]{userName, password}, Integer.class);
    }


    public User GetUserInfo(String userName, String password) {

        return jdbcTemplate.queryForObject(QUERY_USER, new BeanPropertyRowMapper<>(User.class),new Object[]{userName, password});
    }
}
