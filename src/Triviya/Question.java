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
public class Question {
    int type; //0 for yes and now q 1 for american q
    int dif; // 0 for easy 1 for med 2 for hard
    String sub; // question's subject
    Scanner s =new Scanner(System.in);
    
    public Question(){
        boolean sel = true;
        String st;
        while (sel){
            System.out.println("Please Choose the question subject");
            st = s.nextLine();
            st = st.replaceAll("[^a-z]", "");
            st = st.replaceAll("[^A-Z]", "");
            
        }
        System.out.println("Please choose what kind of question is it (0 for yes of no 1 for multiple options)");
        type = s.nextInt();
        System.out.println("please choose the question difficulty (0 for easy 1 for medium 2 for hard)");
        dif = s.nextInt();
    }
}
