package com.codecool.hogwartshouses.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class Teacher {

    //TODO GYURI
    private Long id;

    private String name;
    private String subject;
    private boolean isWitch;
    private int age;

    private Wand wand;

}
