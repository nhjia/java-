
public class Mergearray {
	public static void main(String[] args) {
		int[] a,b,c;
		a = new int[] {24,49,23,28,26,76,89};
		b = new int[] {45,65,78,456,213};
		c = new int[12];
		System.arraycopy(a,0,c,0,7);
		System.arraycopy(b, 0,c,7,5);
		for(int each:c) {
			System.out.println(each);
		}
	}
}
