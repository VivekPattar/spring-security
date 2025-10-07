package com.viv.spring_security.services;

import com.viv.spring_security.doa.UserPrincipal;
import com.viv.spring_security.model.Users;
import com.viv.spring_security.doa.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public class MyUserDetailsService implements UserDetailsService{

    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUsername(username);

        if(user != null){
            System.out.println("User Not Found: 404");
            throw new UsernameNotFoundException("User Not Found: 404");
        }
        return new UserPrincipal(user);
    }
}
