package Animals;

public class Cats extends Animal implements Pet{
		int a = 4;
		public String name;
	public Cats(){
		        super(4);
		        this.name =" ";
		        System.out.println("����è����4����");
		    }
	public Cats(String name) {
		super(4);
		this.name = name;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("è��ë��");
	}
	
}
