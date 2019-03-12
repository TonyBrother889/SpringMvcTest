package test.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {


    public final static String QUERY_USER_INFO="Select count(*) from user where username=? and password=?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    public int VaildUser(String useraName, String password) {

        System.out.print("ss");

        return jdbcTemplate.queryForObject(QUERY_USER_INFO, new Object[]{useraName, password}, Integer.class);
    }
}
