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
public class Item {
    public String productName;
    public double unitPrice;
    public int quantity;
    
    /**
     *
     * @param productName
     * @param quantity
     * @param unitPrice
     */
    public Item(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    /**
     *
     * @return prodName
     */
    public String getProductName(){
        return this.productName;
    }
    
    public double getUnitPrice(){
        return this.unitPrice;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public String printItem(){
        String item = this.productName + ": ";
        item += this.quantity;
        return item;
    }
}
