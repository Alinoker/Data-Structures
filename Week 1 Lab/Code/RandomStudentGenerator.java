/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab.week1;

/**
 *
 * @author a_ham
 */
import java.util.Random;
import java.util.ArrayList;
        
public class RandomStudentGenerator {
    
     public static void main(String[] args) {
        Random rangen = new Random(); //Instance of random Class
        int toplimit = 18;
        
        // This will generate integers between 0 and 18
        int int_toplimit = rangen.nextInt(toplimit);
        
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Alan Ring");	
        names.add("Alberto Gomez");	
        names.add("Anu Yadav");	
        names.add("Carla Brenda Tasinazzo Albiol");	
        names.add("Conor Mcdermott");	
        names.add("Cormac Wallace");	
        names.add("Donal Hanway");	
        names.add("Dryelen Reis");	
        names.add("Ericdavis Duruzowuaku");	
        names.add("John Kulimushi");	
        names.add("Kostiantyn Patrik");	
        names.add("Luca D'Ettorre");	
        names.add("Mohammad Asem Soufi");	
        names.add("Shaun Kalagin");	
        names.add("Sida Pan");	
        names.add("Slobodan Todorovic");	
        names.add("Vendula Fardova");	
        names.add("Viktoras Butkus");	
        names.add("Will Prendergast");	
 
         
         
        System.out.println("The student you have randomly selected is: " + names.get(int_toplimit)); 
    }
    
}
