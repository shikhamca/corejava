package methodoverloading;

public class Methodoverloading {
	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
		obj.sum(5,6);
		obj.sum(5,6,7);
		obj.sum(5,5.6f);
		obj.sum(7.5f,3);
	}
	public void sum(int n1,int n2) {
		System.out.println(n1+n2);
	}
	public void sum(int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	public void sum(int n1,float n2) {
		System.out.println(n1+n2);
	}
	public void sum(float n1,int n2) {
		
		}

}
