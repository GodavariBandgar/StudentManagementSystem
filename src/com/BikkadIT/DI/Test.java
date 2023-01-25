package com.BikkadIT.DI;

public class Test {
	public static void main(String[] args) {
		
	
	
	Student stu=new Student(11, "Godavari", "pune");
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getSname());         //using parameterized constructor
	System.out.println(stu.getSaddress());

	stu.rollno=11;
	stu.sname="Godavari";
	stu.saddress="Pune";
	System.out.println(stu.rollno);        //object create
	System.out.println(stu.sname);
	System.out.println(stu.saddress);
	
	stu.setRollno(11);
	stu.setSname("Godavari");
	stu.setSaddress("Pune");                  // by using setter getter
	System.out.println(stu.getRollno());
	System.out.println(stu.getSname());
	System.out.println(stu.getSaddress());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
