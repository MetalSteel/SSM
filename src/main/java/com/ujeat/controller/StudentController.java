package com.ujeat.controller;

import com.ujeat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import com.ujeat.pojo.Student;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/4/15.
 * 学生类控制层
 */
@Controller
public class StudentController {
    // 注入学生类Service
    @Autowired
    private StudentService service;
    // 查找所有学生
    @RequestMapping("/findAllStudent")
    public @ResponseBody List<Student> findAllStudent() throws Exception {
        return service.findAllStudent();
    }
    // 添加学生
    @RequestMapping("/addStudent")
    public String addStudent(Student student, HttpServletRequest request){
        try {
            service.addStudent(student);
            request.setAttribute("result","添加学生成功");
        } catch (Exception e) {
            request.setAttribute("result","添加学生失败");
            e.printStackTrace();
        }
        return "result";
    }
}
