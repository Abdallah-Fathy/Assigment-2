/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abdallah", 80025, 1.75);
        student.setSubjcet(new Subject(12, "IS", 3));
        student.setAddress(new Address("25", "ahmed", "minia"));
        System.out.println(student.studentDetails());
        
    }
    
}
