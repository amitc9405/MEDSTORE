package com.medicalstore.medicalstore.Service;

import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.users;
import com.medicalstore.medicalstore.web.dto.usersRegistrationdto;

public interface managerService {
    users save_manager(usersRegistrationdto registrationdto);
    manager fetch_by_username(String username);
}
