package com.example.reactspring;

import com.example.reactspring.Model.Employee;
import com.example.reactspring.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ReactSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReactSpringApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("kip");
        employee.setLastName("Rono");
        employee.setEmail("kip@gmail.com");
//        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("kipp");
        employee1.setLastName("Ronoo");
        employee1.setEmail("kipp@gmail.com");
//        employeeRepository.save(employee1);
    }


//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/api/v1/").allowedOrigins("http://localhost:8080");
//            }
//        };
//    }

}
