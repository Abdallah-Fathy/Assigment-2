/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_Class;

/**
 *
 * @author DELL
 */
public class Employee extends Person {
    private String office;
    private double salary;
     Mydate datehired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDatehired(){
        return datehired.getDate();
    }
    
    @Override
    public String toString() {
          return "Class Name : Employee , Person's name: " + getName();
    }

    
    
    
}
