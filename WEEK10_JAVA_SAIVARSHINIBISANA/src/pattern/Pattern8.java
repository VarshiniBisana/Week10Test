package pattern;

public class Pattern8 {
public static void main(String[] args) {
	int row = 6;
	
	for(int i=1;i<row;i++) {
		for(int j=1;j<row;j++) {
			if(i==0 && i==i-1) {
				System.out.println("*");
			}
			else if(j==0 && j== i-1) {
				System.out.println("*");
			}else
				System.out.println(" ");
		}}
		}
		System.out.println("");
	

}
