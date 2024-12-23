package com.example.compositedesignpattern;
import java.util.ArrayList;
import java.util.List;
// Composite Component - Departman : Departmanlar bir grup çalışanı ve/veya managerları içerebilir.
class Department implements Employee {
    private String departmentName; // Departman adı
    private List<Employee> employees; // Departmanda yer alan çalışanların listesi

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Departmana yeni bir çalışan ekler.
    public void addEmployee(Employee employee) {
        employees.add(employee); // Çalışan departmana eklenir.
    }

    // Departman adıyla beraber departmanın tüm alt çalışanlarını yazdırır
    @Override
    public void showDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.showDetails(); // Departmandaki her çalışanın detayları gösterilir.
        }
    }
}