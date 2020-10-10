package Animals;

public abstract class Animal {
	protected int legs;
	public Animal(int a) {
		this.legs=a;
	}
	abstract public void eat();
	public void walk() {
		System.out.println("ÓÃ"+legs+"×ßÂ·");
	}
	
}
