package com.ad.weibo.adinf.Dao;

import com.ad.weibo.adinf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User users) {
        String sql = "insert into user(id,name,pwd) values(?,?,?)";

        return this.jdbcTemplate.update(
                sql,
                users.getId(),
                users.getName(),
                users.getPwd()
        );
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "delete from user where id = ?";

        return this.jdbcTemplate.update(sql, id);
    }

    @Override
    public int update(User users) {
        String sql = "update user set pwd = ? where id = ?";
        return this.jdbcTemplate.update(
                sql,
                users.getPwd(),
                users.getId()
        );
    }

    @Override
    public User getById(Integer id) {
        String sql = "select * from user where id = ?";
        return this.jdbcTemplate.queryForObject(sql, new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User users = new User();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setPwd(rs.getString("pwd"));
                return users;
            }

        }, id);
    }

}
