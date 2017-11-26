//import java.util.ArrayList;

public class Animal {
	
	//create the getters and setters for the instance variables
    //there is a shortcut by hovering over the variable names
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int topSpeed;
	public int getTopSpeed() {
		return topSpeed;
	}
	// For the setter associated with topSpeed make sure the values are between 0 and 70
    // Print "Invalid Speed" if it is not within these values and leave
    // the speed unchanged.
	public void setTopSpeed(int topSpeed) {
		if (topSpeed >= 0 && topSpeed <= 70) {
			this.topSpeed = topSpeed;
		} 
		else {
			System.out.println("Invalid Speed");
		}
		
	}	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables
	//    *******************************************************
	//    FixMe: do we need a no-arg constructor????????????????
	//    *******************************************************
	//Animal() {
	//}
	
	Animal(String newName, int newTopSpeed) {
		setName(newName);
		setTopSpeed(newTopSpeed);
	}

    //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	
	//@Override
	public boolean equals(Object secondAnimal) {
		int a2 = getTopSpeed();
		int a1 = this.topSpeed;
		if (secondAnimal instanceof Animal) {
			if(a1 - a2 <= 2 || a2 - a1 <= 2) {
				return true;
			}
		} 
		return false;
	}
	
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
	// FixMe: return String or return void?
    public String toString(){
        String s = ("Name:  " + this.name + "       Top Speed:  " + this.topSpeed);
        System.out.println(s);
        return s;
    }
	
}
