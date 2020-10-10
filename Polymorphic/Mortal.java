package Polymorphic;

public interface Mortal {
 default void die() {
	System.out.println("who killed another");
}
}
