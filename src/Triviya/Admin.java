/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triviya;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
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
                addQuestion();
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
    
    public void addQuestion(Question q,int type) throws FileNotFoundException, IOException{
        
        Question qst=q;
        if (type == 0){
        FileOutputStream qstFile = new FileOutputStream("questions0");
        ObjectOutputStream dst = new ObjectOutputStream(qstFile);
        
        }
        
        
    }
    
    
    
    
    
    public void createQuestion(){
        int type;
        Scanner s = new Scanner(System.in);
        boolean sel = true;
        String st;
        Question q;
        while (sel){
            System.out.println("Please choose what kind of question is it (0 - yes of no ,1 - multiple options, 2 - open qeustion)");
            type = s.nextInt();
            if (type==0){
                q=new MultipleOptions();
                sel=false;
            }
            else if (type==1){
                q=new YesOrNo();
                sel=false;
            }else if (type==2){
                q=new OpenQuestion();
                sel=false;
            }else
                System.out.println("you have to choose one of the followed options");
        }
    

    }
}
