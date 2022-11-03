package ua.shamray.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.shamray.entity.Employee;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> showAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
        return employee;
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(employee);
    }

}
