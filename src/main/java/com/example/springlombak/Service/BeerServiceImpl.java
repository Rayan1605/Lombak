package com.example.springlombak.Service;

import com.example.springlombak.Model.Beer;
import com.example.springlombak.Model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID beerId) {

        log.debug("Get Beer Id in Service was called ");
        //Log is what you use for debugging NOT sout

     return Beer.builder().
             id(beerId).
             version(1).
             beerName("BeerName").
             beerStyle("BeerStyle").
             upc(123456789L).
             quantityOnHand(12).
             price(BigDecimal.valueOf(12.99)).
             createdDate(null).
             lastUpdatedDate(null).
             build();
    }
}
