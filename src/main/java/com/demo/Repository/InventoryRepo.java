package com.demo.Repository;

import com.demo.Model.Inventory;
import com.demo.Model.Report;

import java.util.*;

/**
 * Created by gsati on 1/17/2018.
 */
public class InventoryRepo {

    Set<Inventory> inventories=new TreeSet<Inventory>();
    // create a inventory
    public void addInventory(Inventory inv){
        inventories.add(inv);
    }
    //update a inventory
    public void updateInventory(Inventory inv){

        inventories.remove(inv);
        inventories.add(inv);
    }
    public void printInv(){
        for(Inventory inv : inventories){
            System.out.println(inv);
        }
        System.out.println("profit from previous report "+ Report.profit);
    }
    public void delete(Inventory inv){
        inventories.remove(inv);
    }

    public Set<Inventory> getAllInventories(){
        return inventories;
    }
    public Inventory getInventoryByName(String itemName){

        for(Inventory inv : inventories){
            if(inv.getItemName().equals(itemName))
                return inv;
        }
        return null;
    }

}
