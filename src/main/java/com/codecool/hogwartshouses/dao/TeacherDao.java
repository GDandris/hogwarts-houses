package com.codecool.hogwartshouses.dao;

import com.codecool.hogwartshouses.model.entity.TeacherEntity;
import java.util.List;

public interface TeacherDao {

    List<TeacherEntity> listAllTeacher();

    TeacherEntity getTeacher(Long id);

    void addTeacher(TeacherEntity teacher);

    void updateTeacher(Long id, TeacherEntity teacher);

    void deleteTeacher(Long id);

    List<TeacherEntity> listTeacherByWandWoodType(String woodType);

}
