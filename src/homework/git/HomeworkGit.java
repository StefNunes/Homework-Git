/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework.git;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Stefani Nunes
 */
public class HomeworkGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
     String MyName;
     
       
       try {
        System.out.println("What's your Name?");
             MyName = myInput.readLine();
        
        System.out.println(" Oh, that is a very nice name," + MyName);
        
        System.out.println("What is your quest ?");
             String quest = myInput.readLine();
        
        System.out.println("What is your Favorite colour ?");
             String colour = myInput.readLine();
             
        System.out.println("Ah, I see your quest is " + quest + ", and your favourite colour is " + colour +".");
  
    } 
    catch (Exception e) {
         
     }
    
    }
    
}
