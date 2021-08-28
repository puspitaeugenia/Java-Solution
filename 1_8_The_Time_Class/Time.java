//1.8 Time Class
import static java.lang.String.format;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void settTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return format("%02d:%02d:%02d", this.hour, this.minute, second);
    }
    public Time nextSecond(){
        if (this.second == 59) {
            this.second = 0;
            if (this.minute == 59) {
                this.minute = 0;
                if (this.hour == 23) {
                    this.hour = 0;
                }
                else {this.hour += 1;}
            }
            else {this.minute += 1;}
        }
        else {this.second += 1;}
    return this;
    }
    public Time previousSecond(){
        if (this.second == 0) {
            this.second = 59;
            if (this.minute == 0) {
                this.minute = 59;
                if (this.hour == 0) {
                    this.hour = 23;
                }
                else {this.hour -= 1;}
            }
            else {this.minute -= 1;}
        }
        else {this.second -= 1;}
    return this;
    }
}