package com.demo.Service;

import com.demo.Model.Inventory;
import com.demo.Model.Report;
import com.demo.Repository.InventoryRepo;
import com.demo.Utility.PrintUtility;

import java.util.Set;

/**
 * Created by gsati on 1/17/2018.
 */
public class InventoryService {
    InventoryRepo repo=new InventoryRepo();
    PrintUtility printUtility=new PrintUtility();

    public void addInventory(String itemName, String sellingPrice, String buyPrice) {

        repo.addInventory(new Inventory(itemName,convertToDouble(sellingPrice),convertToDouble(buyPrice),0));

    }

    public void updateBuyInventory(String itemName, int quantity) {

        Inventory inv= repo.getInventoryByName(itemName);
        quantity+=inv.getQuantity();
        inv.setQuantity(quantity);
        repo.updateInventory(inv);
    }

    public void updateSellInventory(String itemName, int quantity){

        Inventory inv =repo.getInventoryByName(itemName);
        //update profit
        Report.profit+=(inv.getSellingPrice()-inv.getBuyPrice())*quantity;
        quantity=inv.getQuantity()-quantity;
        inv.setQuantity(quantity);
        repo.updateInventory(inv);
    }

    double convertToDouble(String num){
        double d=0;
        try {
            d=Double.parseDouble(num);
        }catch(NumberFormatException e){
            System.out.println("Invalid decimal");
        }
        return d;
    }

    public void report() {

        //print inventory
        Set<Inventory> inventories=repo.getAllInventories();
        printUtility.printReport(inventories);
        //reset profit
        Report.profit=0;
    }

    public void delete(String itemName) {
        Inventory inv = repo.getInventoryByName(itemName);
        //update profit
        Report.profit-=inv.getBuyPrice()*inv.getQuantity();
        repo.delete(inv);
    }
}
