package com.timeslots.demo.controller;

import com.timeslots.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showEmployeeForm() {
        Employee employee = new Employee();

        // Add the command object to the modelview
        ModelAndView mv = new ModelAndView("employee");
        mv.addObject("employee", employee);

        //Add dynamic data to Departments
        List<String> availableDepartments = new ArrayList<String>();
        availableDepartments.add("Human Resources");
        availableDepartments.add("Finance");
        availableDepartments.add("Admin");
        availableDepartments.add("Quality Assurance");
        availableDepartments.add("Products");
        mv.addObject("availableDepartments", availableDepartments);

        // Add dynamic data to the Hobbies list
        List<String> availableHobbies = new ArrayList<String>();
        availableHobbies.add("Reading");
        availableHobbies.add("Dancing");
        availableHobbies.add("Singing");
        availableHobbies.add("Doing Nothing");
        mv.addObject("availableHobbies", availableHobbies);


        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, Employee employee,
                             BindingResult result) {

        model.addAttribute("employee", employee);
        return "success";

    }
}
