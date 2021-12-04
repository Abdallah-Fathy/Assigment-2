/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_Class;
import java.util.GregorianCalendar;
/**
 *
 * @author DELL
 */
public class Mydate {
    private int day;
    private int month;
    private int year;
    GregorianCalendar calendar;
    Mydate(){
        calendar = new GregorianCalendar();
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        month = calendar.get(GregorianCalendar.MONTH)+1;
        year = calendar.get(GregorianCalendar.YEAR);
        
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String getDate(){
        return "Day: "+ day +  ", Month: " + month + ", Year: " + year;
    }
 
}
