
/**
 * A Clock object is used to simulate time and the passing of time.
 * 
 * A clock is set to a given time, it can be examined, and the time advanced.
 * 
 * @author Stephan
 * @version (a version number or a date)
 */
public class Clock {

    private Time currentTime;
    
    /**
     * Create a Clock object set to midnight.
     */
    public Clock(final Time time) {
        this.currentTime=time;
    }

    /**
     * Advance the clock time by the given duration.
     */
    public void advance(Duration duration) {
        currentTime = currentTime.add(duration);
    }

    /**
     * Obtain the current time.
     */
    public Time examine() {
        return currentTime;
    }    
}
