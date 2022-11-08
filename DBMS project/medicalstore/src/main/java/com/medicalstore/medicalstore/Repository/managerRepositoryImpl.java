package com.medicalstore.medicalstore.Repository;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.users;

@Repository
public class managerRepositoryImpl implements managerRepository {

    private static final String INSERT_USER_QUERY="INSERT INTO USERS(username,password,role,enabled,email) VALUES(?,?,?,?,?)";
    private static final String INSERT_MANAGER_QUERY="INSERT INTO MANAGER(manager_name,manager_sex,manager_DOB,manager_aadhar_no,manager_phn_no,manager_state,manager_city,manager_pincode,manager_street,manager_house_no,salary,manager_userid) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String GET_MANAGER_BY_USERNAME_QUERY="SELECT * FROM MEDICALSTORE.MANAGER WHERE IDMANAGER = (SELECT user_id FROM MEDICALSTORE.USERS WHERE USERNAME=?)";


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save_user(users user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(INSERT_USER_QUERY, new String[] { "ID" });
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getRole());
            ps.setInt(4,user.getEnabled());
            ps.setString(5,user.getEmail());
            return ps;
          }, keyHolder);
        // jdbcTemplate.update(INSERT_USER_QUERY,user.getUser_id(),user.getUsername(),user.getPassword(),user.getRole(),user.getEnabled(),user.getEmail());
        return keyHolder.getKey().intValue();
        
    }

    @Override
    public void save_manager(manager manager){
        
        jdbcTemplate.update(INSERT_MANAGER_QUERY,manager.getManager_name(),manager.getManager_sex(),manager.getManager_dob(),manager.getManager_aadhar_no(),manager.getManager_phn_no(),manager.getManager_state(),manager.getManager_city(),manager.getManager_pincode(),manager.getManager_street(),manager.getManager_house_no(),manager.getSalary(),manager.getManager_userid());

        return;
    }

    @Override
    public manager fetch_by_username(String username){
        
        manager m =(manager) jdbcTemplate.queryForObject(GET_MANAGER_BY_USERNAME_QUERY,new BeanPropertyRowMapper(manager.class),username);
        return m;
    }


}
