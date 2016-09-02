package com.mcieciak.service.impl;

import com.mcieciak.dao.RentRepository;
import com.mcieciak.model.Rent;
import com.mcieciak.model.User;
import com.mcieciak.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepository rentRepository;

    @Override
    public List<Rent> findByUser(User user) {
        return rentRepository.findByUser(user);
    }

    @Override
    public void save(Rent rent) {
        rentRepository.save(rent);
    }

    @Override
    public Rent findById(Long id) {
        return rentRepository.findOne(id);
    }

}
