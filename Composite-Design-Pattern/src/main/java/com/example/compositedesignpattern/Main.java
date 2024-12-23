package com.example.compositedesignpattern;
// Client : Organizasyon yapısını oluşturup detaylarını gösteren ana sınıf.
public class Main {
    public static void main(String[] args) {
        // IT Departmanı için Developerlar ve Manager
        Developer dev1 = new Developer("Melike", "Frontend Developer");
        Developer dev2 = new Developer("Sena", "Backend Developer");
        Manager itManager = new Manager("Beyza", "IT Manager");
        itManager.addEmployee(dev1);
        itManager.addEmployee(dev2);

        Department itDepartment = new Department("IT Department");
        itDepartment.addEmployee(itManager);

        // Design Departmanı için Designerlar ve Manager
        Designer designer1 = new Designer("Emir", "Graphic Designer");
        Designer designer2 = new Designer("Elifnaz", "UX Designer");
        Manager designManager = new Manager("Görkem", "Design Manager");
        designManager.addEmployee(designer1);
        designManager.addEmployee(designer2);

        Department designDepartment = new Department("Design Department");
        designDepartment.addEmployee(designManager);

        // General Manager
        Manager generalManager = new Manager("Aybüke", "General Manager");
        generalManager.addEmployee(itDepartment); // IT Departmanı general managera eklenir.
        generalManager.addEmployee(designDepartment); // Design Departmanı general managera eklenir.

        // Organizasyon hiyerarşisinin detaylarını göster
        System.out.println("Company Hierarchy:");
        generalManager.showDetails();
    }
}