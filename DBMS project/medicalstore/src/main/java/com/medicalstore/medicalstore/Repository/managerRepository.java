package com.medicalstore.medicalstore.Repository;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.users;

public interface managerRepository {
    int save_user(users user);
    void save_manager(manager manager);
    manager fetch_by_username(String username);
}
