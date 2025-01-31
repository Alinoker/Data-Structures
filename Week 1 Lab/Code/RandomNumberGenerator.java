/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab.week1;

import java.util.Random;

/**
 *
 * @author tobiek
 */
public class RandomNumberGenerator {
    public static void main (String args[]){
        Random rangen = new Random(); //Instance of random Class
        int toplimit = 18;
        
        // This will generate integers between 0 and 18
        int int_toplimit = rangen.nextInt(toplimit);
        
        System.out.println("The number you have have randomly picked is: " + int_toplimit);
    }
    
}
