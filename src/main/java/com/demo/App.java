package com.demo;

import com.demo.Utility.CommandUtility;
import com.demo.Utility.PrintUtility;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        CommandUtility commandUtility = new CommandUtility();
        Scanner console = new Scanner(System.in);
        String temp;
        List<String> commands=new ArrayList<String>();
        System.out.println("Enter Input");
        while (true){
            temp = console.nextLine();
            if(temp.equals("#"))
                break;
            else {
                commands.add(temp);
            }
        }

        commandUtility.processCommand(commands);
    }

}
