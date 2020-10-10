package Animals;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
		System.out.println("鱼没有脚");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("鱼不能走路");
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
