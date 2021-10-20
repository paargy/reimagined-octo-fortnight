import java.util.Scanner;

public class exer2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int ans= sc.nextInt();
		int i;
		for (i=0; i<ans; i++ ){
			int j;
			for (j=0;j<ans;j++){
		
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}