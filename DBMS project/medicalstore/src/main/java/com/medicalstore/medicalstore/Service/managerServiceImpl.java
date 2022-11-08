package com.medicalstore.medicalstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.medicalstore.medicalstore.Repository.managerRepository;
import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.users;
import com.medicalstore.medicalstore.web.dto.usersRegistrationdto;

@Service
public class managerServiceImpl implements managerService {
    
    @Autowired
    private managerRepository managerrepository;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public users save_manager(usersRegistrationdto registrationdto) {
        // users user = new users(registrationdto.getUsername(),registrationdto.getPassword(),"ROLE_USER",1);
        users user = new users(registrationdto.getUsername(),registrationdto.getEmail(),passwordEncoder.encode(registrationdto.getPassword()),"ROLE_MANAGER",1);
        int id = managerrepository.save_user(user);
        manager manag = new manager(registrationdto.getName(),registrationdto.getGender(),registrationdto.getDob(),registrationdto.getAadhar_no(),registrationdto.getMobile_no(),registrationdto.getState(),registrationdto.getCity(),registrationdto.getPincode(),registrationdto.getStreet(),registrationdto.getHouse_no(),registrationdto.getSalary(),id);
        managerrepository.save_manager(manag);
        return user ;
    }

    @Override
    public manager fetch_by_username(String username) {

        return managerrepository.fetch_by_username(username);
    }
}
