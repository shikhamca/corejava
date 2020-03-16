package methodoverriding;

public class Dog extends Animal {
		  //override
		   public void displayInfo() {
		      System.out.println("I am a dog.");
		   }
		}

		class Main {
		   public static void main(String[] args) {
		      Dog d1 = new Dog();
		      d1.displayInfo();
		   }
		}

