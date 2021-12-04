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
public class Faculty extends Employee{
    private int officeHour;
    private int rank;
    
    public Faculty(){
        
    }

    public Faculty(int officeHour, int rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty, Person's name: " + getName(); 
    }
    
}
