
import java.util.ArrayList;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author lebeko
 * @date 12 August 2021
 * @version 1.0
 */
public class ShoppingCart {
    ArrayList<Item> item;
    public double totalAmount;
    public double payableAmount;
    public double discount;
    public double tax;
    public String coupon;
    
    public ShoppingCart(){
        this.item = new ArrayList<>();
        this.totalAmount = 0;
        this.payableAmount = 0;
        this.discount = 0;
        this.tax = 0;
        this.coupon = "";
    }
    
    /*
    * Add some items to the Shopping Cart.
    */
    public void addItems(Item item){
        this.item.add(item);
    }
    
    /*
    * Delete an item from the Shopping Cart.
    */
    public void deleteItems(Item itemToDelete){
        ListIterator<Item> iterator = item.listIterator();
        while (iterator.hasNext())
        {
            Item item1 = iterator.next();
            if (item1.getProductName().equals(itemToDelete.getProductName()))
                this.item.remove(itemToDelete);
            break;
        }
    }
    /*
    * Display all items in the SHopping Cart
    */
    public void queryCart(){        
        ListIterator<Item> iterator1 = item.listIterator();
        while(iterator1.hasNext()){
            Item item2 = iterator1.next();
            System.out.println(item2.printItem());
        }
    }
    
    /*
    * Calculate the total amount of all the items in the Shopping Cart.
    * 
    */
    public double getTotalAmount(){
        ListIterator<Item> iterator2 = item.listIterator();
        this.totalAmount = 0;
        while(iterator2.hasNext()){
            Item item3 = iterator2.next();
            this.totalAmount = this.totalAmount + (item3.getUnitPrice() * item3.getQuantity());
        }
        return this.totalAmount;
    }
    
    /*
    * Calculate the discount on the items purchased.
    * If there is no discount, return the total amount payable as it is.
    */
    public void getDiscount(String coupon){
        this.coupon = coupon;
        if (coupon.equals("WELCOME20")){
            this.discount = this.getTotalAmount() * 0.2;
            this.totalAmount -= this.discount;
        }
        else{
            this.discount = 0;
            this.totalAmount = this.totalAmount - this.discount;
        }
    }
    
    /*
    * Calculate the actual amount due including VAT (Value Added Tax)
    * Apply the South Africa standard VAT at 14%.
    */
    public double getPayableAmount(){
        this.payableAmount = 0;
        this.tax = this.totalAmount * 0.14;
        this.payableAmount = this.totalAmount + this.tax;
        return this.payableAmount;
    }
    
    /*
    * print the invoice for all the items in the Shopping Cart.
    */
    public void printInvoice(){
        ListIterator<Item> iterator3 = item.listIterator();
        while(iterator3.hasNext()){
            Item item4 = iterator3.next();
            System.out.print(item4.getProductName() + " ");
            System.out.print(item4.getQuantity() + " ");
            System.out.print(item4.getUnitPrice() + " ");
            System.out.printf("%.2f%n", item4.getUnitPrice() * item4.getQuantity());
        }
        
        System.out.printf("  " + "Total    :%.2f%n", this.getTotalAmount());
        this.getDiscount(this.coupon);
        System.out.printf("  " + "Discount :%.2f%n", this.discount);
        this.getPayableAmount();
        System.out.printf("  " + "Tax      :%.2f%n", this.tax);
        System.out.printf("  " + "Total    :%.2f%n", this.getPayableAmount());
    }
}
