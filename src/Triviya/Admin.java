/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triviya;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author oriwi_000
 */
public class Admin extends User{
    
    
    public Admin() throws IOException{
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
            try{
                   
                ObjectOutputStream dst = new ObjectOutputStream(new FileOutputStream("questions0"));

                 dst.writeObject(q);
                 dst.flush();
                 dst.close();
                }
                catch(IOException ex){
                System.out.println("file not found");
                }
        }
          
      if (q.getDif() == 1){
            try{
                   
                ObjectOutputStream dst = new ObjectOutputStream(new FileOutputStream("questions1"));

                 dst.writeObject(q);
                 dst.flush();
                 dst.close();
                }
                catch(IOException ex){
                System.out.println("file not found");
                }
        }
      
      if (q.getDif() == 2){
            try{
                   
                ObjectOutputStream dst = new ObjectOutputStream(new FileOutputStream("questions2"));

                 dst.writeObject(q);
                 dst.flush();
                 dst.close();
                }
                catch(IOException ex){
                System.out.println("file not found");
                }
        }
    }
    
    
    
    
    
    public void createQuestion() throws IOException{
        int type;
        Scanner s = new Scanner(System.in);
        
        String st;
        Question q;
        while (true){
            System.out.println("Please choose what kind of question it is (0 - yes or no ,1 - multiple options, 2 - open qeustion)");
            type = s.nextInt();
            if (type==0){
                q=new MultipleOptions();
                addQuestion(q);
                return;
            }
            else if (type==1){
                q=new YesOrNo();
                addQuestion(q);
                return;
            }else if (type==2){
                q=new OpenQuestion();
                addQuestion(q);
               return;
            }else
                System.out.println("you have to choose one of the followed options");
        }
    
        
            
    }
}
