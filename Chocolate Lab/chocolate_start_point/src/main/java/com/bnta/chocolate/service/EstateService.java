package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {

    @Autowired
    private static EstateRepository estateRepository;

    public static List<Estate> getAll() {
        return estateRepository.findAll();
    }

    public static Estate save(Estate estate){
        return estateRepository.save(estate);
    }

    public static Estate getEstate() {
        return estateRepository.getById(getEstate().getId());
// method to get an individual estate by id
    }
}
