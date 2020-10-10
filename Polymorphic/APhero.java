package Polymorphic;

public class APhero extends Hero implements Mortal{

public APhero(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

@Override
public void die() {
	// TODO Auto-generated method stub
	System.out.println(name);
}
}
