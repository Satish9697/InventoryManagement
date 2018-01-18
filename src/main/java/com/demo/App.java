package com.demo;

import com.demo.Utility.CommandUtility;
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
        System.out.println( "Hello World!" );
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
//        for(int i=0;i<commands.size();i++)
//            System.out.println(commands.get(i));
        commandUtility.processCommand(commands);
    }

}
