package com.codecool.hogwartshouses.dao.mapper.repositoryMapper;

import com.codecool.hogwartshouses.dao.RoomDao;
import com.codecool.hogwartshouses.model.DTO.RoomDTO;
import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.entity.RoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomDaoRepositoryMapper {

    RoomDaoRepositoryMapper INSTANCE = Mappers.getMapper(RoomDaoRepositoryMapper.class);

    RoomDTO toDto(RoomEntity roomEntity);

    RoomEntity toEntity(RoomDTO roomDTO);

}
