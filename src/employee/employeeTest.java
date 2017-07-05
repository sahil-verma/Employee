/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
/**
 *
 * @author sahil
 */
public class employeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Susan Meyers", 47899, "Acoounting", "Vice President");
        System.out.printf("%-15s%-15s%-15s%-15s%n","Name", "idNumber", "Department","Position" );
        System.out.println("______________________________________________________________" );
        System.out.printf("%-15s%-15d%-15s%-15s%n", employee1.getName(), employee1.getIdNumber(), employee1.getDepartment(), employee1.getPosition());
        
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        System.out.printf("%-15s%-15d%-15s%-15s%n", employee2.getName(), employee2.getIdNumber(), employee2.getDepartment(), employee2.getPosition());
        
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.printf("%-15s%-15d%-15s%-15s%n", employee3.getName(), employee3.getIdNumber(), employee3.getDepartment(), employee3.getPosition());

        
        
        
        
    }
    
}
