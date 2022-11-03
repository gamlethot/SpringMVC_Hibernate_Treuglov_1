package ua.shamray.dao;

import ua.shamray.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> showAllEmployees();
    Employee saveOrUpdateEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(Employee employee);
}
