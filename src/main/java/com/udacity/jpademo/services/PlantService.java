package com.udacity.jpademo.services;

import com.udacity.jpademo.entities.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}