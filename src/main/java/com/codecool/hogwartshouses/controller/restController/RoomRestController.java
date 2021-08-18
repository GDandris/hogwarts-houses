package com.codecool.hogwartshouses.controller.restController;

import com.codecool.hogwartshouses.model.DTO.RoomDTO;
import com.codecool.hogwartshouses.model.DTO.StudentDTO;
import com.codecool.hogwartshouses.model.entity.RoomEntity;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rest-api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomDTO> findAll() {
        return roomService.findAll();
    }

    @GetMapping(value = "/{id}")
    public RoomDTO findById(@PathVariable Long id) {
        return roomService.findRoomById(id);
    }

    @PostMapping
    public RoomDTO save(@RequestBody RoomEntity roomEntity) {
        roomEntity.setId(null);
        return roomService.saveRoom(roomEntity);
    }

    @PutMapping("/{id}")
    public RoomDTO update(@RequestBody RoomEntity roomEntity, @PathVariable Long id) {
        roomEntity.setId(id);
        return roomService.saveRoom(roomEntity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        roomService.deleteRoomById(id);
    }

    @GetMapping("/available")
    public List<RoomDTO> findAvailableRooms() {
        return roomService.findAvailableRooms();
    }

    @GetMapping("/student/{id}")
    public List<StudentDTO> findAllResidentOfARoomByRoomId(@PathVariable(value = "id") Long studentId) {
        return roomService.findAllResidentOfARoomByRoomId(studentId);
    }

    @GetMapping("/rat-owners")
    public List<RoomDTO> findAvailableRoomsForRatOwner() {
        return roomService.findRoomWithNoCatOrOwl();
    }
}