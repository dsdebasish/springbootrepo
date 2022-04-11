package com.learn.springboot.tutorial.service;

import com.learn.springboot.tutorial.entity.Department;
import com.learn.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartmentDetails(Department department) {
        return departmentRepository.save(department);
    }
}
