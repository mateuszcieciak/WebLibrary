package com.mcieciak.service;

import com.mcieciak.model.Rent;
import com.mcieciak.model.User;

import java.util.List;

public interface RentService {
    List<Rent> findByUser(User user);

    void save(Rent rent);

    Rent findById(Long id);

}
