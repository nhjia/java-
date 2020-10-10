
public class Arrays {
	public static void main(String[] args) {
		int[][] a =new int[5][8];
		int[] b = new int[40];
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=7;j++) {
				a[i][j]=(int)(Math.random()*100);
			}
		}
		int n=0;
		for(int[] c:a) {
			for (int d : c) {
				b[n++]=d;
			}
		}
		java.util.Arrays.sort(b);
		for(int i=0;i<40;i++) {
			System.out.println(b[i]);
		}
	}
}
