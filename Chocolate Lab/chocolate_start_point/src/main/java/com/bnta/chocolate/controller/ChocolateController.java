package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/chocolates")
        public List<Chocolate> getAll() {
        return ChocolateService.getAll();
    }

    @PostMapping("/chocolates")
    private Chocolate post(@RequestBody Chocolate chocolate){
        return ChocolateService.save(chocolate);
    }

    @GetMapping("/chocolate/{id}")
    public Chocolate getChocolate(@PathVariable int id){
        return chocolateService.getChocolate();
    }

}
