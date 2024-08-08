import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them.
        Clock clock = new Clock(new Time("00:00"));
        Time ourTime = clock.examine(); 
        Register register = new Register();
        TariffTable tariffTable = new TariffTable(10);
        Currency currency = new Currency("R", "ZAR", 100);
        String rate;
        
        tariffTable.addTariff(new TimePeriod(new Duration("minute", 0), new Duration("minute", 30)), new Money("R10", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("minute", 30), new Duration("hour", 1)), new Money("R15", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 1), new Duration("hour", 3)), new Money("R20", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 3), new Duration("hour", 4)), new Money("R30", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 4), new Duration("hour", 5)), new Money("R40", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 5), new Duration("hour", 6)), new Money("R50", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 6), new Duration("hour", 8)), new Money("R60", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 8), new Duration("hour", 10)), new Money("R70", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 10), new Duration("hour", 12)), new Money("R90", currency));
        tariffTable.addTariff(new TimePeriod(new Duration("hour", 12), new Duration("hour", 24)), new Money("R100", currency));
        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
        System.out.println("The current time is "+ourTime.toString()+".");
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {           
                int advance = keyboard.nextInt();
                clock.advance(new Duration("minute", advance));
                System.out.println("The current time is "+ clock.examine()+"." );
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
               }  else if (input.equals("tariffs")) {
                // Print the list of parking tariffs from the TariffTable
                System.out.println(tariffTable.toString());
                 } else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
                //String UID_One = UIDGenerator.makeUID();
                Ticket myTicket = new Ticket(clock.examine());
                register.add(myTicket);
                System.out.print("Ticket issued: ");
                System.out.println(myTicket.toString()+".");                
            }
            else if (input.equals("depart")) {
               
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
                String departTicket = keyboard.next();
                if ( register.contains(departTicket)) {
                  System.out.println("Ticket details: " + register.retrieve(departTicket).toString()+".");
                  System.out.println("Current time: " + clock.examine().toString() + "." );
                  Duration duration = register.retrieve(departTicket).age(clock.examine());
                  String ourDuration = duration.format(duration, "minute");
                  System.out.println("Duration of stay: "+ ourDuration+".");
                  Money tariff = tariffTable.getTariff(duration);
                  System.out.println("Cost of stay : " + tariff.toString() + ".");
                } else {
                  System.out.println("Invalid ticket ID.");
                }
                
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, tariffs, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
