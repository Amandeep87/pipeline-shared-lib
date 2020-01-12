def call(Closure body) { //define a call method which accepts a closure paramter. this is an anonymous block of code 
	script{ //executes the block of code.
      body()
	}    
}
