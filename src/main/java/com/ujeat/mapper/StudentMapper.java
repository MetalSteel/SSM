package com.ujeat.mapper;

import com.ujeat.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/4/15.
 * 学生类DAO操作
 */
public interface StudentMapper {
    // 添加学生
    void addStudent(Student student) throws Exception;
    // 删除学生
    void deleteStudent(String id) throws Exception;
    // 修改学生
    void updateStudent(Student student) throws Exception;
    // 查找所有学生
    List<Student> findAllStudent() throws Exception;
}
