package com.simplilearn.typecasting;

import java.util.Scanner;

public class ExplicitTypeCastingExample {

	public static void main(String[] args) {
		
		//Explicit TypeCasting or Narrowing
		//(double -> float -> long -> int -> short -> byte)
		
		 System.out.println("=======================");
		 System.out.println("Explicit TypeCasting ..");
		 System.out.println("=======================");
		 System.out.println("Please enter any Number ::");
		 
		 Scanner doubleInput = new Scanner(System.in);
		 double doubleValue = doubleInput.nextDouble();
		 
		 System.out.println("Value taken in input from console before explicit ::" + doubleValue + " and its datatype is :: " + ((Object)doubleValue).getClass().getSimpleName());

		 float floatValue = (float)doubleValue;
		 long longValue   = (long)floatValue;
		 int intValue     = (int)longValue;
		 short shortValue = (short)intValue;
		 byte byteValue   = (byte)shortValue;
		 
		 System.out.println("double value after explicit into float :: " + floatValue + " and its datatype is :: " + ((Object)floatValue).getClass().getSimpleName());
		 System.out.println("float value after explicit into long   :: " + longValue + " and its datatype is :: " + ((Object)longValue).getClass().getSimpleName());
		 System.out.println("long value after explicit into int     :: " + intValue + " and its datatype is :: " + ((Object)intValue).getClass().getSimpleName());
		 System.out.println("int value after explicit into short    :: " + shortValue + " and its datatype is :: " + ((Object)shortValue).getClass().getSimpleName());
		 System.out.println("short value after explicit into byte   :: " + byteValue + " and its datatype is :: " + ((Object)doubleValue).getClass().getSimpleName());
		 
		 
	}

}
