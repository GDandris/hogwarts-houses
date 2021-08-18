package com.codecool.hogwartshouses.model;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Building {
    private Long id;
    private Integer numberOfRooms;

    public Building(Building otherBuilding){
        //TODO create @CopyConstructor :)
        this.id = otherBuilding.id;
        this.numberOfRooms = otherBuilding.numberOfRooms;
    }
}