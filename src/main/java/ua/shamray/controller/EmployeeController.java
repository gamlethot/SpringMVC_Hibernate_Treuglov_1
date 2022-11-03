package ua.shamray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.shamray.entity.Employee;
import ua.shamray.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployeeList(Model model){
        model.addAttribute("allEmps", employeeService.showAllEmployees());
        return "show-all-employees";
    }

    @RequestMapping("/add")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add-employee";
    }

    @RequestMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveOrUpdateEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateEmployee(@RequestParam("id") int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "add-employee";
    }

    @RequestMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id){
        Employee employee = employeeService.getEmployee(id);
        employeeService.deleteEmployee(employee);
        return "redirect:/";
    }

}
