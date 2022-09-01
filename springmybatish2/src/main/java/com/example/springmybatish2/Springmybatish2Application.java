package com.example.springmybatish2;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springmybatish2.entity.Employee;
import com.example.springmybatish2.repository.EmployeeMapper;

@MappedTypes(Employee.class)
@MapperScan("com.example.springmybatish2.repository")
@SpringBootApplication
public class Springmybatish2Application implements CommandLineRunner{

	public Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public EmployeeMapper employeeRepository;
    
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10011l, "Ramesh", "Fadatare", "ramesh@gmail.com")));
        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10012l, "John", "Cena", "john@gmail.com")));
        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10013l, "tony", "stark", "stark@gmail.com")));

        logger.info("All users -> {}", employeeRepository.getAllEmployees());
	}

	public static void main(String[] args) {
		SpringApplication.run(Springmybatish2Application.class, args);
	}

	
}
