package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate e1 = new Estate("Maui Ku'ia", "Hawaii");
        Estate e2 = new Estate("Bournville", "UK");
        Estate e3 = new Estate("The Rabot", "St Lucia");
        Estate e4 = new Estate("Equanimious","Ecuador");

        Chocolate o1 = new Chocolate("Mississippi Mud Pie", 36, e3);
        Chocolate o2 = new Chocolate("Supermilk hazelnut", 65, e3);
        Chocolate o3 = new Chocolate("Rocky Road", 40, e3);
        Chocolate o4 = new Chocolate("Dairy Milk",20, e2);
        Chocolate o5 = new Chocolate("Darkmilk", 40, e2);
        Chocolate o6 = new Chocolate("Chomp", 14, e2);
        Chocolate o7 = new Chocolate("Maui Mokka Cappuccino", 55, e1);
        Chocolate o8 = new Chocolate("Mango Dark", 6, e1);
        Chocolate o9 = new Chocolate("Blood orange dark milk", 60, e4);

//this needs to be set in order to show on db
        e1.setChocolates(List.of(o7,o8));
        e2.setChocolates(List.of(o4, o5,o6));
        e3.setChocolates(List.of(o1,o2,o3));
        e4.setChocolates(List.of(o9));


        estateRepository.saveAll(List.of(e1,e2,e3,e4));
//        h2 db will only save objects if we place them in the () here^^

    }
}
