package com.acceleratedskillup;

class Car {
  int numberOfDoors //property
  String brand //property
  String model
  def script //variable to hold pipeline script object
  
	Car(script) { //constructor
		this.script = script
	}
	
  	void printOutCar() {  //function
		script.echo "using script.echo"
  		script.echo "numberOfDoors:${numberOfDoors}"    	
		script.echo "brand:${brand}"    	
		script.echo "model:${model}"
  	}  
  
}
