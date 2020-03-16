package variable;

public class Variabledemo {
int x=6;//instance variable
static int y=7;//static variable
public void display() {
	int a = 5;//local variable
	int b = 7;//local variable
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	Variabledemo h1=new Variabledemo();
	Variabledemo h2=new Variabledemo();
	h2.x=10;
	System.out.println(h1.x);
	System.out.println(h2.x);
	System.out.println(Variabledemo.y);
	Variabledemo.y=8;
	System.out.println(Variabledemo.y);
}
	
}

