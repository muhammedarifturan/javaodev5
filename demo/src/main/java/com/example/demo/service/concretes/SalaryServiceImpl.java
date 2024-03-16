package com.example.demo.service.concretes;

import com.example.demo.entity.Salary;
import com.example.demo.service.abstracts.SalaryService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;

@Service
public class SalaryServiceImpl implements SalaryService {

    private UserRepository userRepository;
    @Override
    public void createSalary(Salary salary) {
userRepository.save(salary);
    }
}
