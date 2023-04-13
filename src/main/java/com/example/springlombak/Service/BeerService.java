package com.example.springlombak.Service;

import com.example.springlombak.Model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID beerId);
}
