package com.example.demo.controller;

import com.example.demo.entity.Salary;
import com.example.demo.service.abstracts.SalaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salaryies")
public class SalaryController {
    private SalaryService salaryService;
    @PostMapping("/create")
    public void createSalary(@RequestBody Salary salary){
        salaryService.createSalary(salary);

    }

}
