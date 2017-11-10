package com.assignment_4.superclasses;

/**
 * Class Human instantiates with only two attribute, name. 
 * Methods are getName(), setName() getAge() and setAge().
 *  
 * @author Ameshwari Om     
 * @author Lars Weingartner
 * @version 1.0
 * @exception NameFormatException  
 *
 *
 */
public class Human{

/**
 * Uses the default constructor     
 * 
 * @author Ameshwari Om
 * @author Lars Weingartner
 * @version 1.0
 * @param name Attribute to handle the name
 */
    private String name = "";
    private int age = 0;

    /**
     * A constructor that sets the name and age in that order.     
     * 
     * @author Ameshwari Om
     * @author Lars Weingartner
     * @version 1.0
     * @param name Attribute to handle the name
     * @param age Attribute to handle the age
     */ 
    public Human(String name, int age){
    	this.name = name;
    	this.age= age;
    }

    /**
     * Method for getting the attribute name. 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return The attribute name.
     */
    public String getName(){
	return this.name;
    }

    /**
     * Method for setting the attribute name. It uses the method testName to see that it does'nt contains anything but letters (A-ö), comma and space.
     * Uses testName
     *
     * @author Ameshwari Om     
     * @author Lars Weingartner
     * @version 1.0
     * @param The name used to set
     * @exception NameFormatException
     */
    public void setName(String name){
    	this.name = name;
    }

    /**
     * Method for getting the attribute age. 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return The attribute age.
     */
    public int getAge(){
	return this.age;
    }

    /**
     * Method for setting the attribute age.
     *
     * @author Ameshwari Om     
     * @author Lars Weingartner
     * @version 1.0
     * @param The age used to set
     */
    public void setAge(int age){
    	this.age = age;
    }
}
