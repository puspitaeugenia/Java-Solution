//1.6 Date Class
import static java.lang.String.format;
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        //day = [1, 31]
        this.day = day;
        //month = [1, 12]
        this.month = month;
        //year = [1900, 9999]
        this.year = year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return format("%02d/%02d/%d", this.day, this.month, this.year);
    }
}