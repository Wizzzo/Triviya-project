/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triviya;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oriwi_000
 */
public class Admin extends User{
    
    
    public Admin(){
        Scanner s =new Scanner(System.in);
        boolean sel=true;
        String opt="";
        while (sel){
            System.out.println("What would you like to do? (add, exit, change(change user), *)");
            opt=s.nextLine();
            if (opt.equals("add")){
                System.out.println("add");
                createQuestion();
            }else if (opt.equals("exit")){
                    System.out.println("exit");
                System.exit(0);
            }else if (opt.equals("change") || opt.equals("change user")){
                System.out.println("cahnge");
                sel=false;
                System.out.println(sel);
            }else System.out.println("Only the following options are available");
        }
    }
    
    public void addQuestion(Question q) {
        
        Question qst=q;
        if (q.getDif() == 0){
        FileOutputStream qstFile;
            try {
                qstFile = new FileOutputStream("questions0");
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        ObjectOutputStream dst = new ObjectOutputStream(qstFile);
        dst.writeObject(q);
        }
          
        if (q.getDif() == 1){
        FileOutputStream qstFile = new FileOutputStream("questions1");
        ObjectOutputStream dst = new ObjectOutputStream(qstFile);
        dst.writeObject(q);
        }
         
        if (q.getDif() == 2){
        FileOutputStream qstFile = new FileOutputStream("questions2");
        ObjectOutputStream dst = new ObjectOutputStream(qstFile);
        dst.writeObject(q);
        }
        
        
    }
    
    
    
    
    
    public void createQuestion() throws IOException{
        int type;
        Scanner s = new Scanner(System.in);
        
        String st;
        Question q;
        while (true){
            System.out.println("Please choose what kind of question is it (0 - yes of no ,1 - multiple options, 2 - open qeustion)");
            type = s.nextInt();
            if (type==0){
                q=new MultipleOptions();
                return;
            }
            else if (type==1){
                q=new YesOrNo();
                return;
            }else if (type==2){
                q=new OpenQuestion();
               return;
            }else
                System.out.println("you have to choose one of the followed options");
        }
    
        addQuestion(q);
            
    }
}
