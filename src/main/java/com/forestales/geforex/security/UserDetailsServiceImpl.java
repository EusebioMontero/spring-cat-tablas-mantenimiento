package com.forestales.geforex.security;


import com.forestales.geforex.security.entities.UserEntity;
import com.forestales.geforex.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userService.getByUserLogin(username).get();
        System.out.println(UserDetailImpl.build(user));
        return UserDetailImpl.build(user);
    }
}
