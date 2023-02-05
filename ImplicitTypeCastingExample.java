package com.simplilearn.typecasting;

import java.util.Scanner;

public class ImplicitTypeCastingExample {

	public static void main(String[] args) {
		
		
		//Implicit TypeCasting or Widening
	//	  (byte -> short -> int -> long -> float -> double)
		 
		 System.out.println("=======================");
		 System.out.println("Implicit TypeCasting ..");
		 System.out.println("=======================");
		 System.out.println("Please enter any Number ::");
		 
		 Scanner byteInput = new Scanner(System.in);
		 byte byteValue = byteInput.nextByte();
		 
		 System.out.println("Value taken in input from console ::" + byteValue);
		
		 
		 short shortValue = byteValue;
		 
		 int intValue = shortValue;
		 
		 long longValue = intValue;
		 
		 float floatValue = longValue;
		 
		 double doubleValue = floatValue;
		 
		 System.out.println("Value type casting to short  ::" + shortValue);
		 System.out.println("Value type casting to int    ::" + intValue);
		 System.out.println("Value type casting to long   ::" + longValue);
		 System.out.println("Value type casting to float  ::" + floatValue);
		 System.out.println("Value type casting to double ::" + doubleValue);
		 
		 
		 
		 
		 
		 
		 
		
	}

}
