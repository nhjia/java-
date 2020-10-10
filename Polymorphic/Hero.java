package Polymorphic;

public class Hero implements Mortal {
	public String name; //姓名
    
    float hp; //血量
    public Hero(String name) {
    	this.name = name;// TODO Auto-generated constructor stub
	}
    private void kill(Mortal m) {
		// TODO Auto-generated method stub
    	System.out.print(name+"杀了");
    	m.die();
	}
    public static void main(String[] args) {
		Hero  garren = new Hero("盖伦");
		ADhero ad = new ADhero("女警");
		APhero ap = new APhero("aphero");
		garren.kill(ad);
		garren.kill(ap);
	}
}
