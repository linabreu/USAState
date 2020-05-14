/*
Lina Breunlin
Module 01 Lab
Part A

This is the class file for the StateDemo program

This class is used as a template to create state objects

 */
package statedemo;


public class USAState 
{
    
//declare instance variables
private String nameOfState;
private String capitalCity;
private int population;
private int area;


/**set state's name to new value
 * @param stateName
 */

public void settNameOfState (String stateName)
{
    nameOfState = stateName;
}

/**set state's capital city to new value
 * @param stateCapital
 */

public void setStateCapital (String stateCapital)
{
    nameOfState = stateCapital;
}

/**set state's population  to new value
 * @param statePop
 */

public void setPopulation (int statePop)
{
    population = statePop;
}

/**set state's area  to new value
 * @param stateArea
 */

public void setArea (int stateArea)
{
    area = stateArea;
}

/**gets current value of stateName
*@return stateName
*/

public String getStateName ()
{
    return nameOfState;
}

/**gets current value of stateCapital
*@return capitalCity
*/
public String getCapitalCity ()
{
    return capitalCity;
}

/**gets current value of population
*@return population
*/
public int getPopulation ()
{
    return population;
}

/**gets current value of area
*@return area
*/
public int getArea ()
{
    return area;
}



//constructor method for state with Arizona defaults
public USAState ()
{
    nameOfState = "Arizona";
    capitalCity = "Phoenix";
    population = 7172000;
    area = 113998;
   
}

/** constructor method that allows for creation of ANY state
    @param stateName = name of the state
    @param stateCapital = capital city of the state
    @param statePop = population of state written as millions
    @param stateArea = geographic area in square miles 
 */

public USAState (String stateName, String stateCapital, int statePop, int stateArea)
{
  nameOfState = stateName;
  capitalCity = stateCapital;
  population = statePop ;
  area = stateArea;  
}

 /**
     method to annex Canada
     @param population = user input for desired number of bedrooms
     @param area = user input for desired floor
   
     */
public  static void annexCanada (int population, int area)
{
    //declare local variables
    final int CANPOP = 37000000;
    final int CANAREA = 37800000;
    int newPop = 0;
    int newArea = 0;
    int currPop = 0;
    int currArea = 0;
    
    currPop = 
    
    newPop = population + CANPOP;
    newArea = area + CANAREA;   
}



}   
    

