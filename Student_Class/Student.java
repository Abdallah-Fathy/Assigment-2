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
public class Student {
    private String name;
    private int studentId;
    private double studentGpa;
    Subjcet subjcet;
    Address address;

    public Student(String name, int studentId, double studentGpa) {
        this.name = name;
        this.studentId = studentId;
        this.studentGpa = studentGpa;
        subjcet = new Subjcet();
        address = new Address();
        
    }

    public Student(String name, int studentId, double studentGpa, Subjcet subjcet, Address address) {
        this(name, studentId, studentGpa);
        this.subjcet = subjcet;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public Subjcet getSubjcet() {
        return subjcet;
    }

    public void setSubjcet(Subjcet subjcet) {
        this.subjcet = subjcet;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
   public String studentDetails(){
       return "name: " + name + "\n ID: " + studentId + "\n GPA: " + studentGpa + "\n subject: " + getSubjcet() + "\n Address: " +getAddress();
   }
    
    
    
}
