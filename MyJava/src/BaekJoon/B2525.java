package BaekJoon;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();

		int $c = c / 60;
		int remainC = c % 60;

		m += remainC;
		if(m >= 60) {
			int $m = m - 60;
			m = 0;
			m += $m;
			h++;
		}
		
		h += $c;
		if (h >= 24) {
			int $h = h - 24;
			h = 0;
			h += $h;
		}
		
		System.out.println(h + " " + m);
	}

}
