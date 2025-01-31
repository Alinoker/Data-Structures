/*
Lab 1a Data structures - Aline Francisco - 31/01/2025 - National College of Ireland

▪1: Create an Instance of the Random Class using the Random () method
▪2: Print out a random number between 0 and 18

Test the code to validate a random number is generated
▪3: Copy out the First Name or Full Name of fellow students in your Cohort (HDSDEV_SEP24) 
and arrange in an alphabetical order.
▪4: Add the names (Aline, Marcos, Jose, Fulano, Cicrano) as elements to an ArrayList called names
▪5: Print out a random student’s name in the format below:
*/
import java.util.ArrayList; //array to store the students names
import java.util.Collections; //sorting functionality
import java.util.Random;  //to generate random numbers
 
public class Lab1a {
     public static void main(String[] args) {
         //1create an instance of the Random class using the Random () method 
         Random random = new Random();
 
         //2generate and print a random number between 0 and 18
         int randomNumber = random.nextInt(19); 
         //generates a random integer between 0 - 18 (since nextInt(n) produces numbers from 0 to n-1
         System.out.println("Random number (0-18): " + randomNumber);
 
         //3,4create an ArrayList and student names
         ArrayList<String> names = new ArrayList<>();
         names.add("Aline");
         names.add("Marcos");
         names.add("Jose");
         names.add("Fulano");
         names.add("Cicrano");
 
         //3Sort names alphabetically
         Collections.sort(names);
         System.out.println("Sorted Names: " + names);
 
         //5Select and print a random student’s name
         String randomStudent = names.get(random.nextInt(names.size()));
         System.out.println("The student you have randomly picked is: " + randomStudent);
     }
 } 