import java.io.File;
import java.io.FileNotFoundException;
//
import java.util.Scanner;
/**
 * See Assignment II Question II
 *
 * @author Stephan Jamieson
 * @version 26/7/2019
 */
public class MarketPlace {
    
    private MarketPlace() {}
    
    private final static Currency RAND = new Currency("R", "ZAR", 100);
    
    
    // Create an instance of Seller with attributes ID, name, location, product, 
       Seller seller = new Seller();
   
    // unit_price and number_of_units
    private static Seller makeSeller(final String data) {
        final Scanner scanner = new Scanner(data.trim());
        scanner.useDelimiter("\\s*,\\s*");
        
        
        
        // Add your code here
        Seller seller = new Seller(); // create seller object so we can store our information from the file
        
        seller.id = scanner.next();
        seller.name = scanner.next();
        seller.location = scanner.next();
        seller.product = scanner.next();
        seller.unitPrice = scanner.next();
        seller.numberOfUnits = scanner.nextInt();
      
        return seller;  
      }
    
    // Read the contents of CSV file into an array.
    // See the Appendix on page 4 of the Assignment sheet.
    private static Seller[] parseFile(final String fileName) throws FileNotFoundException {
        final Scanner inFile = new Scanner(new File(fileName));
        Seller[] sellers = null;
    
        if (inFile.hasNextInt()) {
            sellers = new Seller[Integer.parseInt(inFile.nextLine().trim())];
            for (int index=0; index<sellers.length; index++) {
                sellers[index] = makeSeller(inFile.nextLine());
            }
        }
        inFile.close();
        return sellers;
    }
    
    public static void main(final String[] args) throws FileNotFoundException {
        final Scanner inKey = new Scanner(System.in);
        System.out.println("Enter the name of a \"Comma Separated Values\" (CSV) file:");
        final Seller[] sellers = parseFile(inKey.nextLine());
                
        // Your Code here  
        if (sellers == null || sellers.length == 0) { // Check if array is empty or null
         System.out.println("The file contains no seller data.");
         }else {
         //  If array is not empty ask the user questions
        String product;
        String unitPrice;
        String units;
      
        System.out.println("Enter the name of a product:");
        product = inKey.nextLine();
        System.out.println("Enter the number of units required:");
        units = inKey.nextLine();
        System.out.println("Enter the maximum unit price:");
        unitPrice = inKey.nextLine();
        Money price = new Money(unitPrice, RAND); // Create Money object
        int i;
        i = 0;
        
        for ( Seller seller : sellers) { // Where seller is an element in sellers
            Money shopPrice = new Money(seller.unitPrice, RAND);
            if ( (product.equals(seller.product)) && ((Integer.parseInt(units)) <= seller.numberOfUnits) && ( price.compareTo(shopPrice) > -1) ) {
               i++;
               System.out.println(seller.id + " : " + seller.name + " in "+ seller.location + " has " + seller.numberOfUnits + " " + seller.product + " for " + seller.unitPrice + " each.");
            }
         }
               if (!(i>0)) {
                  System.out.println("None found.");
               }
         }
     
}
}
