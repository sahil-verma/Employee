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
public class Employee {

    
       //variables holding employees data
       String name, department, position;
       int idNumber;
       
       // first constructor to set the name, idNumber, department, position for class employee
       public Employee(String name, int idNumber, String department, String position){
           this.name = name;
           this.idNumber = idNumber;
           this.department = department;
           this.position = position;
       }
       //second constructor to set the name, idNumber, (department and position= empty string) for class employee
       public Employee(String name, int idNumber){
           this.name = name;
           this.idNumber = idNumber;
           this.department = "";
           this.position = "";
       }
       //third construcrtor to set idNumber = 0,(name, department and position = empty string)  for class employee
       public Employee(){
           this.name = "";
           this.department = "";
           this.position = "";
           this.idNumber = 0;
       }
       // get methods to get name, idNumber, department, position
       public String getName(){
           return this.name;
       }
       public int getIdNumber(){
           return this.idNumber;
       }
       public String getDepartment(){
           return this.department;
       }
       public String getPosition(){
           return this.position;
       }
       
       // set methods to set name, idNumber, department, position
       public void setName(String name){
           this.name = name;
       }
       public void setIdNumber(int idNumber){
           this.idNumber = idNumber;
       }
       public void setDepartment(String department){
           this.department = department;
       }
       public void setPosition(String position){
           this.position = position;
       }
    
      
}
