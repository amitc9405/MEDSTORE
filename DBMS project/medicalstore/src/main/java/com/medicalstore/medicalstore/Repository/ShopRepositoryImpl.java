package com.medicalstore.medicalstore.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.shop;

@Repository
public class ShopRepositoryImpl implements ShopRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String MANAGERS_NOT_ASSIGNED_SHOP="select * from manager where not exists (select 1 from shop where shop.emp_id = idmanager)";
    private static final String INSERT_SHOP_WITH_MANAGER_ID = "INSERT INTO shop(shop_name,shop_state,shop_city,shop_pincode,shop_street,emp_id) VALUES(?,?,?,?,?,?)";
    private static final String INSERT_SHOP_WITHOUT_MANAGER_ID = "INSERT INTO shop(shop_name,shop_state,shop_city,shop_pincode,shop_street) VALUES(?,?,?,?,?)";
    @Override
    public void save_shop(shop Shop) {
        if(Shop.getEmp_id()==0){
            jdbcTemplate.update(INSERT_SHOP_WITHOUT_MANAGER_ID, Shop.getS_name(),Shop.getS_state(),Shop.getS_city(),Shop.getS_pincode(),Shop.getS_street());
            return;
        }
        jdbcTemplate.update(INSERT_SHOP_WITH_MANAGER_ID, Shop.getS_name(),Shop.getS_state(),Shop.getS_city(),Shop.getS_pincode(),Shop.getS_street(),Shop.getEmp_id());
    }

    @Override
    public List<manager> ManagersWithoutShop() {
        List<manager> managers = jdbcTemplate.query(MANAGERS_NOT_ASSIGNED_SHOP, new BeanPropertyRowMapper(manager.class));
        return managers;
    }
    
    
}
