/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triviya;

import java.util.Scanner;

/**
 *
 * @author oriwi_000
 */
public abstract class Question {
    int dif; // 0 for easy 1 for med 2 for hard
    String sub; // question's subject
    Scanner s =new Scanner(System.in);
    
    public Question(){
        boolean sel = true;
        String st="";
        int type;
 /*       type = s.nextInt();
        while (sel){
            System.out.println("Please Choose the question subject");
            st = s.nextLine();
            st = st.replaceAll("[^a-z][^A-Z]", "");
//            st = st.replaceAll("[^A-Z]", "");
            
        }
        
        System.out.println("please choose the question difficulty (0 for easy 1 for medium 2 for hard)");
        dif = s.nextInt();*/
        
        while (sel){
            System.out.println("Please Choose the question subject");
            st = s.nextLine();
            boolean sel2=true;
            while (sel2){
                System.out.println("are you sure that the name of the subject is "+st+"? (y or n)");
                String c=s.nextLine();
                if (c.equals("y") || c.equals("n")){
                    if (c.equals("y"))
                        sel=sel2=false;
                }else sel2=false;
            }
            sub = st.replaceAll("[^a-z,^A-z]", "");
//            st = st.replaceAll("[^A-Z]", "");
        }
        System.out.println("Done");
        
  //      System.out.println("please choose the question difficulty (0 for easy 1 for medium 2 for hard)");
    //    type = s.nextInt();
    }
}

