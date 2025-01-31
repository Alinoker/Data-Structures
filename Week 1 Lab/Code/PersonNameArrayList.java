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
import java.util.Scanner;

public class PersonNameArrayList {
    public static void main (String args[]){
    
    // Task 1: create and add three Person type elements to the list.
    ArrayList<Person> myperson = new ArrayList<>();
    
    myperson.add(new Person("Paul", 30));
    myperson.add(new Person("Anthony", 24));
    myperson.add(new Person("Kelvin", 58));
    
    // Task 2a: print using toSring() method
    System.out.println("\nOutput of Task 2a\n");
    System.out.println("The list of names are: " + myperson.toString());

    // Task 2b: print using printPerson() method
    System.out.println("\nOutput of Task 2b\n");
    for(int j = 0; j<myperson.size(); j++){
        System.out.println(myperson.get(j).printPerson());
        }
    
    // Task 3: Add Person (a new person)
    myperson.add(1, new Person("philip", 28));
    
    // Task 4: print using Iterator method
    System.out.println("\nOutput of Task 4\n");
    Iterator<Person> i;
    i = myperson.iterator();
    while (i.hasNext()){
        System.out.println(i.next().printPerson());
    }
    
    // Task 5: Remove element from first position
    myperson.remove(0);
    
    // Task 6: print elements out
    System.out.println("\nOutput of Task 6\n");
    for(int x = 0; x<myperson.size(); x++){
        System.out.println(myperson.get(x).printPerson());
        }
    
    // Task 7: Check if a person's name exist, if so print it
    System.out.println("\nOutput of Task 7\n");
    Scanner mysc = new Scanner(System.in);
    System.out.println("Enter Name: ");
    // Read input from the user
    String searchName = mysc.nextLine();
    // For example: String searchName = "Paul";
    int personIndex = -1;

    // For each element
    for(int k =0; k < myperson.size(); k++){
        // Check if the current name is equal to the name to search
        if (searchName.equals(myperson.get(k).getName())) {
            // Found the person with that name
            personIndex = k;
            break;
        }
    }
    // Print out the result
    if (personIndex != -1) {
        // Person was found
        System.out.println("\n" + searchName + " is in the list! "
                + "and was found at position [" + personIndex + "]");
    } else {
        System.out.println("\nName entered not found!");
    }

    }
}
