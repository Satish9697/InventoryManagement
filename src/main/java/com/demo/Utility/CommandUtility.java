package com.demo.Utility;

import com.demo.Model.Inventory;
import com.demo.Repository.InventoryRepo;
import com.demo.Service.InventoryService;

import java.util.List;

/**
 * Created by gsati on 1/17/2018.
 */
public class CommandUtility {
    public void processCommand(List<String> commands) {
        InventoryService inventoryService=new InventoryService();
        for(String command : commands){
            String[] tokens = command.split(" ");
            tokens[0]=tokens[0].toLowerCase();
            if(tokens[0].equals("create")){
                inventoryService.addInventory(tokens[1],tokens[2],tokens[3]);
            }
            else if(tokens[0].equals("delete")){
                inventoryService.delete(tokens[1]);
            }
            else if(tokens[0].equals("updatebuy")){
                inventoryService.updateBuyInventory(tokens[1],convertToInt(tokens[2]));
            }
            else if(tokens[0].equals("updatesell")){
                inventoryService.updateSellInventory(tokens[1],convertToInt(tokens[2]));
            }
            else if(tokens[0].equals("report")){
                inventoryService.report();

            }
            else{
                System.out.println("invalid command");
            }

        }
    }

    int convertToInt(String num){
        int i=0;
        try {
            i= Integer.parseInt(num);
        }catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }
        return i;
    }
}
