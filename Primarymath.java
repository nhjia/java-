
public class Primarymath {
		public static void main(String[] args) {
			int a=0,b=0,c=0,d=0;
			for(a=1;a<15;a++) {
				for(b=1;b<15;b++) {
					for(c=1;c<15;c++) {
						for(d=1;d<15;d++) {
							if(a+b==8&&a+c==14&&c-d==6&&b+d==10)
								System.out.println(a+" "+b+" "+c+" "+d);
						}
					}
				}
			}
		}
}
