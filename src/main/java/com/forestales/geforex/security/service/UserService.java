package com.forestales.geforex.security.service;


import com.forestales.geforex.security.entities.UserEntity;
import com.forestales.geforex.security.repositories.I_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    I_UserRepository userRepository;
    public Optional<UserEntity> getByUserLogin(String userLogin) {
        return userRepository.findByUsuLogin(userLogin);
    }
}
