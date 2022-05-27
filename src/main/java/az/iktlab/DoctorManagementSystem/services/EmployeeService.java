package az.iktlab.DoctorManagementSystem.services;

import az.iktlab.DoctorManagementSystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
