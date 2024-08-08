// Program to create a register system
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 25 August 2023

class Register {
   public Ticket[] tickets;
   int numTickets;
   
   public Register () {
      this.tickets = new Ticket[100];
      this.numTickets = 0;
   }
   
   public void add (Ticket ticket) {
    // Add Tickets and increases the number of tickets
      this.tickets[this.numTickets] = ticket;   
      this.numTickets = this.numTickets + 1;
   }
   
   public boolean contains(String ticketID) {
      // Searches for each ticket in the array and compares it with input
      for (int i=0; i< this.numTickets; i++) {
         if (this.tickets[i].ID().equals(ticketID)) {
               // returns true if input ticket is found
               return true;
            }
         }
         return false;
   }
        
   public Ticket retrieve (String ticketID) {
      for (int i=0; i< this.numTickets; i++) {
         if (tickets[i].ID().equals(ticketID)) {
               return this.tickets[i];
         }
      }
      return this.tickets[0];
   }
  }