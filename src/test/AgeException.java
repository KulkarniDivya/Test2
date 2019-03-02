package test;



public class AgeException extends Exception{
	AgeException()
	{
		System.out.println("Age should be greater than 20 and less than 55");
	}
}

