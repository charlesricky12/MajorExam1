

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	println("Number #1");                     //> Number #1
	
	def fib(n:Int):Int = {
		
		if (n == 0) {
			 return 1
			 
		}else if(n == 1) {
			 return 1
			 
		}else {
			fib(n- 1) + fib(n - 2);
			}
		}                                 //> fib: (n: Int)Int
		println(fib(6));                  //> 13
		
		//--------------
	
	println("Number #2");                     //> Number #2

	def fizzString(fizzString:String):Unit = {
		
		  if (fizzString.startsWith("f") && fizzString.endsWith("b")) {
			println("FizzBuzz")
		} else if (fizzString.startsWith("b") && fizzString.endsWith("f")) {
			println("FizzBuzz")
		} else if(fizzString.startsWith("f") || fizzString.endsWith("f")) {
			println("Fizz")
		} else if(fizzString.startsWith("b") || fizzString.endsWith("b")) {
			println("Buzz")
		}  else {
			println(fizzString);
		}
		
	}                                         //> fizzString: (fizzString: String)Unit
	println(fizzString("fig"));               //> Fizz
                                                  //| ()
	println(fizzString("dib"));               //> Buzz
                                                  //| ()
	println(fizzString("fib"));               //> FizzBuzz
                                                  //| ()
	
	//-------------
	
	println("Number #3");                     //> Number #3
	
	def factorial(n:Int):Int = {
		
		if (n > 0) {
			n * (n-1) * (n-2);
			return n;
		} else {
			n * n;
			return n;
		}
		
	}                                         //> factorial: (n: Int)Int
	println(factorial(1));                    //> 1
	println(factorial(2));                    //> 2
	println(factorial(3));                    //> 3
}