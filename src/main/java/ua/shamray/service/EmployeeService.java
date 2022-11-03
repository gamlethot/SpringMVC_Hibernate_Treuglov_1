package ua.shamray.service;

import ua.shamray.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> showAllEmployees();
    Employee saveOrUpdateEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(Employee employee);
}
