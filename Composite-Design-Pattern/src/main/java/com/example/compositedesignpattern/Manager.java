package com.example.compositedesignpattern;
import java.util.ArrayList;
import java.util.List;
// Composite Component - Manager : Managerlar kendi çalışanlarını ve alt managerları içerebilir.
class Manager implements Employee {
    private String name; // Manager adı
    private String position; // Manager pozisyonu
    private List<Employee> subordinates; // Manager astlarının listesi

    // Constructor
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }

    // Managera bir ast ekler.
    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    // Managerın adını, pozisyonunu ve astlarını ekrana yazdırır.
    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + " - Position: " + position);
        System.out.println("Subordinates:");
        for (Employee employee : subordinates) {
            employee.showDetails(); // Managerın tüm astlarının detayları gösterilir.
        }
    }
}
