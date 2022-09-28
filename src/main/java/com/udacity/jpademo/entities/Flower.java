package com.udacity.jpademo.entities;

import org.hibernate.annotations.Nationalized;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "flower")
@Inheritance (strategy =  InheritanceType.JOINED)
public class Flower extends Plant {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
