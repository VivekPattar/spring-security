package com.viv.spring_security.doa;

import com.viv.spring_security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
