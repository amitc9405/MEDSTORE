package com.medicalstore.medicalstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.medicalstore.Repository.ShopRepository;
import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.shop;

@Service
public class ShopSeviceImpl implements ShopService {

    @Autowired
    ShopRepository shopRepository;

    

    @Override
    public void save_shop(shop Shop) {
        shopRepository.save_shop(Shop);
        return;
        
    }



    @Override
    public List<manager> ManagersWithoutShop() {
        return shopRepository.ManagersWithoutShop();
    }
    
    
}
