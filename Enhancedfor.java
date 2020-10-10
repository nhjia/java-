
public class Enhancedfor {
	public static void main(String[] args) {
		int[] a = {21,45,65,87,65};
		int b = a[0];
		for (int each : a) {
			if(each > b)
				b = each ;
		}
		System.out.println(b);
	}
}
