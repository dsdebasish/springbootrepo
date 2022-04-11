package com.learn.springboot.tutorial.controller;

import com.learn.springboot.tutorial.entity.Department;
import com.learn.springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartmentDetails(@RequestBody Department department){
        return departmentService.saveDepartmentDetails(department);
    }
}
