package com.ai.groovy.learn.test1

/*
 * To test 
 * 
 * 1. dynamic properties
 * 2. behavior of get/set
 * 3. How a property access is resolved to a get/set method
 * 
 * Demonstrates
 * 
 * 1. A groovy class
 * 2. Meaning of def (like an alias for Object type)
 * 3. Using maps
 * 4. property access
 * 5. defining typed and untyped (def) functions
 * 
 */
class GroovyTest2 {

	private def propMap = [:]
	
	String get(String name)
	{
		propMap[name];
	}
	
	String set(String name, String value)
	{
		propMap[name] = value;
		println "set method called ${name}:${value}"
	}
	
	//Test what is the return value of a function
	//when the last call does not return anything!
	//It seem to return null in such cases
	def f1()
	{
		println "f1 called"
	}
	static void main(String... args)
	{
		println "hello world"
		
		GroovyTest2 gc = new GroovyTest2();
		gc.p1 = "hello"
		gc.p2 = "why"
		
		println "done ${gc.p2}"
		
		//it seem to return a null
		println gc.f1()
	}
}
