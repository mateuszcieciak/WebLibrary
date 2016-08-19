package com.mcieciak.service;

import com.mcieciak.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Mateusz on 12.08.2016.
 */
public interface UserService extends UserDetailsService{
    void save(User user);
}
