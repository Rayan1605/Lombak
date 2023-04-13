package com.example.springlombak.BeerController;

import com.example.springlombak.Service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
@AllArgsConstructor //  so now Lombal will generate the constructor for us below
// and it will do this for dependency injection
@Controller

public class BeerController {
    private final BeerService beerService;


   // public BeerController(BeerService beerService) {
   //     this.beerService = beerService;
   // }
}
