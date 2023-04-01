import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int time = h * 60 + m1 + m2;
		
		h = time / 60;
		m1 = time % 60;
		
		
		if (h >= 24) {
			h = h - 24;
		}
					
		System.out.print(h + " " + m1);
	}

}