package com.udacity.jpademo.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.udacity.jpademo.entities.Plant;
import com.udacity.jpademo.entities.PlantDTO;
import com.udacity.jpademo.entities.Views;
import com.udacity.jpademo.services.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @GetMapping("/delivered/{id}")
    public Boolean delivered(@PathVariable Long id) {
        return plantService.delivered(id);
    }

    @GetMapping("/under-price/{price}")
    @JsonView(Views.Public.class)
    public List<Plant> plantsCheaperThan(@PathVariable BigDecimal price) {
        return plantService.findPlantsBelowPrice(price);
    }

    public PlantDTO getPlantDTO(String name){
        return convertPlantToPlantDTO(plantService.getPlantByName(name));
    }

    @JsonView(Views.Public.class)
    public Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }

    private PlantDTO convertPlantToPlantDTO(Plant plant){
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plant, plantDTO);
        return plantDTO;
    }


}