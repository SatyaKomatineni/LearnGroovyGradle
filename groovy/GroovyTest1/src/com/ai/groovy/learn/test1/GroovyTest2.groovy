package com.ai.groovy.learn.test1

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
