package com.ujeat.service.impl;

import com.ujeat.mapper.StudentMapper;
import com.ujeat.pojo.Student;
import com.ujeat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/15.
 * 学生类业务操作接口的实现
 */
@Service
public class StudentServiceImpl implements StudentService{
    // 注入学生操作DAO
    @Autowired
    private StudentMapper mapper;

    // 添加学生
    public void addStudent(Student student) throws Exception {
        mapper.addStudent(student);
    }
    // 删除学生
    public void deleteStudent(String id) throws Exception {
        mapper.deleteStudent(id);
    }
    // 更新学生
    public void updateStudent(Student student) throws Exception {
        mapper.updateStudent(student);
    }
    // 查找所有学生
    public List<Student> findAllStudent() throws Exception {
        return mapper.findAllStudent();
    }
}
