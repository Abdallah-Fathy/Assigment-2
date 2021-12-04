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
public class Student extends Person {
    private int status;
    private final int FRESHMAN = 1;
    private final int SOPHMORE = 2;
    private final int JUNIOR = 3;
    private final int SENIOR = 4;
    
    public Student(){
        
    }

    public Student(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status){
            case 1:
                return "Freshman";
            case 2:
                return "Sophmore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Not Valid Status";
        }
    }

    public void setStatus(int status) {
        this.status = status;
        
    }

    @Override
    public String toString() {
        return "Class name : Student , Person's name: "+ name;
    }
    
}
