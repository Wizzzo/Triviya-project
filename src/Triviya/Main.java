/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Triviya;
import java.io.*;
import java.util.Scanner;
import java.time.Clock;

/**
 *
 * @author oriwi_000
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Wellcome to the Trivia Consol application");
        Scanner s=new Scanner(System.in);
        String op= "";
        String opt="";
        while (true){
            while (true){
                System.out.println("Please select an operator (admin or user, exit to quit):");
                op = s.nextLine();
                op=op.toLowerCase();
                if (op.equals("admin") || op.equals("user") || op.equals("exit"))
                    break;
                else System.out.println("You have to choose one of the following");
            }
            User u;
            if (op.equals("admin"))
                u=new Admin();
            else if (op.equals("user"))
                u= new User();
            else if (op.equals("exit"))
                System.exit(0);
        }
    }
}
