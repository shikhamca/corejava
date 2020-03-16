package variable;

public class Example {
		 int salary; // Instance Variable

		 public void show() {
		  int value = 2; // Local variable
		  value = value + 10;
		  System.out.println("The Value is : " + value);
		  salary = 10000;
		  System.out.println("The salary is : " + salary);
		 }

		 public static void main(String args[]) {
		  Example eg = new Example();
		  eg.show();
		 }
		}

