import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		for (int i=1;i<=m;i++) {
			if (i>=10)
				break;
			for (int j=1;j<=n;j++) {
				if (i+j==10) {
					count++;
					break;
				}
			}
		}
		
		if (count == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		} else {
			System.out.println("There are "+ count +" ways to get the sum 10.");
		}
	}

}
