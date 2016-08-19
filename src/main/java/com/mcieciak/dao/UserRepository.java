package com.mcieciak.dao;

import com.mcieciak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz on 12.08.2016.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
