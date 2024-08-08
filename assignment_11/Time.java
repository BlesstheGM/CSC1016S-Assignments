import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A Time object represents a clock reading composed of hours, minutes, and seconds.
 * 
 * 
 * @author Stephan Jamieson
 * @version 30/5/10
 */
//
public class Time implements Comparable<Time> {

    private final int hours;
    private final int minutes;
    private final int seconds;
    
    /**
     * Create a Time object representing the given time in hours and minutes.
     */
    public Time(int hours, int minutes, int seconds) {
        assert(0<=hours&&hours<24&&0<=minutes&&minutes<60&&0<=seconds&&seconds<=60);
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public Time(String string) {
        final Scanner scanner = new Scanner(string);
        scanner.useDelimiter(":");
        assert(scanner.hasNextInt());
        this.hours = scanner.nextInt();
        assert(scanner.hasNextInt());
        this.minutes = scanner.nextInt();
        assert(scanner.hasNextInt());
        this.seconds = scanner.nextInt();
    }
        
    /**
     * Obtain the number of hours.
     */
    public int getHours() { return this.hours; }
    
    /**
     * Obtain the number of minutes.
     */
    public int getMinutes() { return this.minutes; }
    
    /**
     * Obtain the number of seconds.
     */
    public int getSeconds() { return this.seconds; }
    
    /**
     * Translate this Time object into a duration in seconds.
     */
    private int asDuration() {
        final int value = this.hours*3600+this.minutes*60+this.seconds;
        return value;
    }
    
    
    /**
     * Obtain the period between this time and the given time by subtracting the latter 
     * from the former.
     */
    public Time subtract(Time other) {
        int difference = this.asDuration()-other.asDuration();
        assert(difference>=0);
        final int seconds = difference%60;
        difference=difference/60;
        final int minutes = difference%60;
        difference=difference/60;
        final int hours = difference;
        return new Time(hours, minutes, seconds);
    }
        
    /**
     * Returns true if the given object is a Time object and represents the same time value as this Time 
     * object, otherwise returns false.
     */
    public boolean equals(Object o) {
        if (!(o instanceof Time)) {
            return false;
        }
        else {
            Time other = (Time)o;
            return this.asDuration()==other.asDuration();
        }
    }
    
    /**
     * Obtain a hashcode value for this object.
     */
    public int hashCode() {
        return this.asDuration();
    }
    
    /**
     * Compare this Time object with the other Time object, returning -1, 0 or 1, depending on whether this 
     * Time precedes, is equal to, or exceeds the other time value.
     * 
     */
    public int compareTo(Time other) {
        final int difference = this.asDuration()-other.asDuration();
        return difference==0 ? 0 : difference/Math.abs(difference);
    }
   
    private String format(int value) {
        if (value<10) {
            return "0"+value;
        }
        else {
            return ""+value;
        }
    }

    /**
     * Obtain a String representation of this Time.
     */
    public String toString() {
        return format(this.getHours())+":"+format(this.getMinutes())+":"+format(this.getSeconds());       
    }


}
