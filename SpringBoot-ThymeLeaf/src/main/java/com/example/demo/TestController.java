package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.employee.Employee;
import com.example.demo.user.User;

@Controller
public class TestController {

	@GetMapping("/iteration")
    public String iteration(Model model) {
        List < Employee > employees = new ArrayList < > ();
        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com"));
        employees.add(new Employee("John", "Cena", "john@gmail.com"));
        employees.add(new Employee("Tom", "Cruise", "tom@gmail.com"));
        employees.add(new Employee("Tony", "Stark", "tony@gmail.com"));
        model.addAttribute("employees", employees);
        return "iteration";
    }    
}
