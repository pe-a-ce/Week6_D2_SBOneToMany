package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {

    @Autowired
    private static ChocolateRepository chocolateRepository;

    public static List<Chocolate> getAll(){
        return chocolateRepository.findAll();
    }

    public static Chocolate save(Chocolate chocolate){
        return chocolateRepository.save(chocolate);
    }

    public Chocolate getChocolate() {
        return chocolateRepository.getById(getChocolate().getId());
    }
}
