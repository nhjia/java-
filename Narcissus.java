
public class Narcissus {
	public static void main(String[] args) {
		int a,b,c,i;
		for(i=100;i<999;i++) {
			c = i%10;
			b = (i/10)%10;
			a = (i/100)%10;
			if(c*c*c+b*b*b+a*a*a == i) {
				System.out.println(i);
			}
		}
	}
}
