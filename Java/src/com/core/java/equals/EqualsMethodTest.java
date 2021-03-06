package com.core.java.equals;

class Student{
	

	String name ;
	
	int id;

	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student studentArg = (Student) obj;
		
		return (this.name == studentArg.name) && (this.id == studentArg.id);

		/*boolean returnVal = false;*/
		
		/*if(this.name == testArg.name){
			returnVal = true;
		}
	
		//return returnVal;
	
		
		if(this.name == testArg.name){
			return true;
		}
		
	//	return false;
		*/
	
	}
}


public class EqualsMethodTest {
	

	public static void main(String[] args) {
		
		Student s1 = new Student("vinod",10);
		
		Student s2 = new Student("vinod",20);
		
		Student s3 = new Student("vinod",10);
		
/*		String ss1 = new String("rakesh");
		
		String ss2 = new String("rakesh");*/
		
		System.out.println( s1 == s2);
		
		System.out.println( s1.equals(s2) ); 
		
		System.out.println( s1.equals(s3) ); //ctrl+Alt+downArrow
		
		/*System.out.println(ss1 == ss2);
		
		System.out.println( ss1.equals(ss2) );*/
	}
}
