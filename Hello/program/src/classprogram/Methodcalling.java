package classprogram;

public class Methodcalling {
	static int x=10;
	int y=20;
	public void add() {
		System.out.println(x);
		System.out.println(y);
	}
	public void multi() {
	int result=x*y;
	System.out.println(result);
}
public static void main(String[] args) {
	
		Methodcalling r = new Methodcalling();
	
	r.multi();
	r.add();
		
	}
}
