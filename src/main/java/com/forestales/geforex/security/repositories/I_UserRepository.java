package com.forestales.geforex.security.repositories;

import com.forestales.geforex.security.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface I_UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsuLogin(String userlogin);



}
