/* Lab 1b Data structures - Aline Francisco - 31/01/2025 - National College of Ireland

▪1Create and add three Person Names to an ArrayList. 
Each element will be added at the end of the list

▪2Print the elements of the ArrayList using the following approaches
-toString() method
-A For loop combined with get() method

Assess the differences in printing when using the two approaches
▪3Add a new Person’s name on the second position of the ArrayList
▪4Print the elements of the ArrayList using ITERATOR object to check
 if the new person was added

▪5Remove the element(person) on first position
▪6Print the elements of the ArrayList to check if the person was removed
▪7Check if a person with a given name exists in the ArrayList . 
If so, print person’s position in the list.
*/
import java.util.ArrayList;
import java.util.Iterator;


class Lab1b {
    public static void main(String[] args){
    //1 ArrayList with 3 names, each element added at the end of the list
    ArrayList<String> names = new ArrayList<>();
    names.add("Lala");
    names.add("Lili");
    names.add("Lolo");

    names.add(1,"Lele");//3 add a new name 2 position of the ArrayList

    //2 Print the elem of the ArrayList using the following approaches
    //toString() method
    String myStr = "lets print shall we ";
    System.out.println(myStr +names.toString());
        
    //For loop, with get() method
    System.out.println("printing again: ");
    for (int i = 0; i < 3; i++) {
        System.out.println(names.get(i));
    }


    //▪4Print elem the ArrayList with ITERATOR to check if new person was added
    Iterator<String> it = names.iterator();//creates Iterator obj for the arraylist
    System.out.println("using Iterator now its: ");
  //here



    while (it.hasNext()) { //check if there are more elements
        String name = it.next(); //get next element
        System.out.println(name);
    }

    //5 Remove the element (person) in the first position
    names.remove(0);

    //6Print the ArrayList to check if the person was removed
    System.out.println("after removing the first person:");
    for (String name : names) { 
        System.out.println(name);
    }

    //7check if a person with a given name exists in the ArrayList
    String searchName = "Lili"; //my name to search for
    if (names.contains(searchName)) { //check if the name exists in the list
        int position = names.indexOf(searchName); //get the index of the name
        System.out.println(searchName + " exists in the list at position: " + (position + 1));
    } else {
        System.out.println(searchName + " does not exist in the list.");
    
    }
    }
    
}
