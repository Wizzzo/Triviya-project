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
        boolean sel=true;
        String op= "";
        String opt="";
        while (sel){
            System.out.println("Please select an operator (admin or user):");
            op = s.nextLine();
            op=op.toLowerCase();
            if (op.equals("admin") || op.equals("user"))
                sel=false;
        }
        User u;
        if (op.equals("admin"))
            u=new Admin();
        else u=new User();
        
    }
    
}
