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

    public Optional<List<UserEntity>> getUsers() {
        return Optional.of(userRepository.findAll());
    }

    public Optional<UserEntity> getByUserLogin(String userLogin) {
        return userRepository.findByUsuLogin(userLogin);
    }


    public Optional<UserEntity> getByUserId(Long id) {
        return userRepository.findById(id);
    }


    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public boolean deleteUser(UserEntity user) {
        try {
            userRepository.delete(user);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
