package inheritance;

public class Dog extends Animal
{
		   public void bark() {
		      System.out.println("I can bark");
		   }
		


		   public static void main(String[] args) {

		      Dog dog1 = new Dog();

		      dog1.eat();
		      dog1.sleep();

		      dog1.bark();
		   }
		}




