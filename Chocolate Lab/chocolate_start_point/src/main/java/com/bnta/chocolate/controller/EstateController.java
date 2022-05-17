package com.bnta.chocolate.controller;

import ch.qos.logback.core.BasicStatusManager;
import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
private EstateService estateService;

    @GetMapping("/estates")
    public List<Estate> getAll() {
        return EstateService.getAll();
    }

    @PostMapping("/estates")
    private Estate post(@RequestBody Estate estate){
        return EstateService.save(estate);
    }

    @GetMapping("/estates/{id}")
    public Estate getEstate (@PathVariable int id){
        return EstateService.getEstate();
    }

}
