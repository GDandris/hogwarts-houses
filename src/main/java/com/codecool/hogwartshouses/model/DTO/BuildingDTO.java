package com.codecool.hogwartshouses.model.DTO;

import com.codecool.hogwartshouses.model.entity.RoomEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Setter
@Getter
public class BuildingDTO {
    private Integer numberOfRooms;
    private List<String> pictures;
    private Set<RoomEntity> roomEntities;
}