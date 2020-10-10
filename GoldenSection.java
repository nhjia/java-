
public class GoldenSection {
		public static void main(String[] args) {
			double a,b = 0,m=0,n=0;
			double e = 0.618;
			double c = 0,d=1;
		for(a=1;a<=10;a++) {
			for(b=a+1;b<=20;b++) {
				if (a%2==0&&b%2==0)
					continue;
				c = (double)(a/b);
				if(Math.abs(c-e)<d)
				{
					m = a;
					n = b;
					d = Math.abs(c-e);
				}	
				if(c < e)
					break;
			}
		}
			System.out.println(m+" "+n);
			System.out.println(m/n);
		}
}
