/*
Lina Breunlin
Module 01 Lab
Part A

program creates an array of states of users size and choice

test cases
Display Info:
Arizona, Phoenix, 7172000, 113998
Colorado, Denver, 5696000, 104185

Annex Canada
Arizona New pop: 44172000, Arizona New Area: 37913998
Colorado New Pop: 42696000, Colorado New Area: 37904185  


 */
package statedemo;


public class StateDemo {
    
    public static void main(String[] args) 
    {
        USAState Arizona = new USAState ();
        USAState Colorado = new USAState("Colorado", "Denver", 5696000, 104185);

        displayInfo (Arizona);
        displayInfo (Colorado);
        
        annexCanada (Arizona);
        annexCanada (Colorado);
    }

/**
     Display the current state info
     @param obj
*/
public static void displayInfo (USAState  obj)
{
    //decalre variables
    String name;
    String capital;
    int pop;
    int area;

    //call the gets to get the state of the Obj
    name = obj.getStateName();
    capital = obj.getCapitalCity();
    pop = obj.getPopulation();
    area = obj.getArea();

    //print to screen
    
    System.out.println ("***************State Information**************");
    System.out.println ("The state name is: " + name);
    System.out.println ("The capital of " + name + " " + "is: " + capital);
    System.out.println ("The population of " + name + " " + "is: " + pop + " " + "people");
    System.out.println ("The area of " + name + " " + "is: " + area + " " + "square miles");
    System.out.println ();

}

/**
     Display info related to the changes in population and area if the state takes over Canada
     @param obj
*/
public  static void annexCanada (USAState  obj)
{
    //declare local variables
    String name;
    final int CANPOP = 37000000;
    final int CANAREA = 37800000;
    int newPop = 0;
    int newArea = 0;
    int currPop = 0;
    int currArea = 0;
    
    name = obj.getStateName();
    currPop = obj.getPopulation();
    currArea = obj.getArea();
    
    newPop = currPop + CANPOP;
    newArea = currArea + CANAREA;   
    
    
    System.out.println ("***************Canada Has Been Annexed**************");
    System.out.println ("The new population of " + name + " " + "is: " + newPop + " " + "people");
    System.out.println ("The new area of " + name + " " + "is: " + newArea + " " + "square miles");
    System.out.println ();
}

}










