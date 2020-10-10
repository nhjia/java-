package Polymorphic;

public class ADhero extends Hero implements Mortal{

public ADhero(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

@Override
public void die() {
	// TODO Auto-generated method stub
	System.out.println(name);
}
}
