
/**
 * A Ticket object represents a car park ticket. It has a unique ID and time of issue (24 hour clock).
 * 
 * @author Stephan Jamieson
 * @version 29/9/10
 */
public class Ticket {

    private String id;
    private Time issueTime;
    private boolean valid;
    
    /**
     * Create a new Ticket that has the given issue time and a unique ID.
     */
    public Ticket(final Time issueTime) {
        this.id = UIDGenerator.makeUID();
        this.issueTime = issueTime;
    }
    
    /**
     * Obtain the ID of this Ticket.
     */
    public String ID() { 
        return id; 
    }
        
    /**
     * Obtan the issue time for this ticket.
     */
    public Time issueTime() { 
        return issueTime;
    }
    
    /**
     * Given the current time, determine this ticket's age i.e. subtract issue time from current time.
     */
    public Duration age(final Time currentTime) { 
        return currentTime.subtract(issueTime());
    }

    
    /**
     * Obtain a String representation of this Ticket in the form 'Ticket[id="dddddddd", time="hh:mm:ss", <valid/void>]'.
     */
    public String toString() {
        return "Ticket[id="+id+", time="+issueTime+"]";
    }
}
