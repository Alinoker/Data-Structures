/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab.week1;

/**
 *
 * @author a_ham
 */
import java.util.ArrayList;
import java.util.Iterator;
public class StringNameArrayList {
    
    public static void main (String args[]){
    
    // Task 1: create and add three Person type elements to the list.
    ArrayList<String> myperson = new ArrayList<>();
    myperson.add("Paul");
    myperson.add("Anthony");
    myperson.add("Kelvin");
    
    // Task 2a: print using toSring() method
    System.out.println("\nOutput of Task 2a\n");
    System.out.println("The list of names are: " + myperson.toString());
    
    // Task 2b: print using for loop and get() method
    System.out.println("\nOutput of Task 2b\n");
    for (int j = 0; j<myperson.size(); j++){
        System.out.println(myperson.get(j));
    }
    
    // Task 3: Add Person (a new person)
    myperson.add(1, "Philip");
    
    // Task 4: print using Iterator method
    System.out.println("\nOutput of Task 4\n");
    Iterator i;
    i = myperson.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
   
    // Task 5: Remove element from first position
    myperson.remove(0);
    
    // Task 6: print using Iterator method
    System.out.println("\nOutput of Task 6\n");
    for (int j = 0; j<myperson.size(); j++){
        System.out.println(myperson.get(j));
    }
    
    // Task 7: Check if a person's name exist, if so print it
    System.out.println("\nOutput of Task 7\n");
    int index;
    // check if the name is in the ArrayList
    if (myperson.contains("Anthony")){
        // Check for the index of the name found
        index = myperson.indexOf("Anthony");
        System.out.println("Anthony is in the list! " + 
                "and was found at position [" + index + "]");
    } else{
        System.out.println("Name entered not found!");
    }
    
    
    
    
  }
    
}
