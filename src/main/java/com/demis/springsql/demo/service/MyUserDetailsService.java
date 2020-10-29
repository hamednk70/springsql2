package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.User;
import com.demis.springsql.demo.model.UserPrincipal;
import com.demis.springsql.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findUsersByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new UserPrincipal(user);
    }

    public String ceratedynamiDepId(String orgName, String depName) {
        return orgName + depName ;
    }

}
