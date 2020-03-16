package classprogram;

public class Rectangle{
int length;//Data members
		int breadth;//Data members

		public void display()
		{
			System.out.println("Length="+length);
			System.out.println("Breadth="+breadth);
			}
	   public void calculateArea() {
	int result = length*breadth;
	System.out.println("Result is:"+result);
	}
	   
	   public static void main(String[] args) 
	   
	   {
		   Rectangle r =new Rectangle();
		   r.display();
		   r.calculateArea();
		
	}
}

