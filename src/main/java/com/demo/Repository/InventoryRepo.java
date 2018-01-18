package com.demo.Repository;

import com.demo.Model.Inventory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gsati on 1/17/2018.
 */
public class InventoryRepo {

    Set<Inventory> inventories=new HashSet<Inventory>();
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
