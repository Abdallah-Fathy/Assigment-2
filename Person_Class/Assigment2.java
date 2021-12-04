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
public class Assigment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Abdallah");
        System.out.println(person.toString());
        Student student = new Student();
        student.setName("Abdallah");
        System.out.println(student.toString());
        Employee employee = new Employee();
        employee.setName("Abdallah");
        System.out.println(employee.toString());
        Faculty faculty = new Faculty();
        faculty.setName("abdallah");
        System.out.println(faculty.toString());
        Staff staff = new Staff();
        staff.setName("Abdallah");
        System.out.println(staff.toString());
                
    }
    
}
