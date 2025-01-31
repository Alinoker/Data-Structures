/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab.week1;

/**
 *
 * @author tobiek
 */
public class Person {
    public String name;
    public int age;
    
    //public static void main (String args[]){
          
    public Person (String inName, int inAge)
    {
       name = inName;
       age = inAge;
    }
    public void setName(String newname)
    {
        this.name = newname;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int newage)
    {
        this.age = newage;
    }
    public int getAge()
    {
        return age;
    }
    public String printPerson()
    {
        return (name+" "+age+"\n");
    }
   
  }


