package Polymorphic;

public class Hero implements Mortal {
	public String name; //����
    
    float hp; //Ѫ��
    public Hero(String name) {
    	this.name = name;// TODO Auto-generated constructor stub
	}
    private void kill(Mortal m) {
		// TODO Auto-generated method stub
    	System.out.print(name+"ɱ��");
    	m.die();
	}
    public static void main(String[] args) {
		Hero  garren = new Hero("����");
		ADhero ad = new ADhero("Ů��");
		APhero ap = new APhero("aphero");
		garren.kill(ad);
		garren.kill(ap);
	}
}
