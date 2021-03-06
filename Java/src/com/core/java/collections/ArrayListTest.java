package com.core.java.collections;

import java.util.ArrayList;

class Student1{
	int id;
	String name;

	public Student1(int id) {
		super();
		this.id = id;
	}

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ArrayListTest {

	public static void main(String[] args) {
		
		int[] a = new int[5]; // Homogenious
		
		ArrayList<Integer> myList = new ArrayList<Integer>(); // Heterogenious
		
		myList.add(10);
		
		myList.add(20);
		
		myList.add(5);
		
		//System.out.println(myList);
	
		/*	
		myList.add("vinod");
		
		myList.add("rakesh");
		
		myList.add("java");
		
		System.out.println(myList);
		
		*/
		
		for(int x :myList){
			System.out.println(x);
			
		}
		
		ArrayList<Student1> stCollection1 = new ArrayList<Student1>();
		
		Student1 s1=new Student1(1001);
		Student1 s2=new Student1(1002);
		stCollection1.add(s1);
		stCollection1.add(s2);
		stCollection1.add(new Student1(1003));
		
		s1.id = 1004;
		
		int count = 1;
		for(Student1 s:stCollection1){
			
			if(count == 3){
				s.id = 1005;
				stCollection1.remove(2);
			}
			
			//System.out.println(s);
			
			count++;
			
		}
		
		ArrayList<Student1> stCollection2 = new ArrayList<Student1>();
		
		stCollection2.add(new Student1(1006,"vinod"));
		stCollection2.add(new Student1(1007,"a"));
		stCollection2.add(new Student1(1008,"b"));
		
		stCollection2.addAll(stCollection1);
		
		
		System.out.println(stCollection2);
	}
}
