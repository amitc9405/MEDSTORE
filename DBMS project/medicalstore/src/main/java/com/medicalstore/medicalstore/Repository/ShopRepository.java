package com.medicalstore.medicalstore.Repository;

import java.util.List;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.shop;

public interface ShopRepository {
    List<manager> ManagersWithoutShop();
    void save_shop(shop Shop);
}
