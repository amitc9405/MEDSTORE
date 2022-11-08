package com.medicalstore.medicalstore.Service;

import java.util.List;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.shop;

public interface ShopService {
    List<manager> ManagersWithoutShop();
    void save_shop(shop Shop);
}
