package BaekJoon;

import java.util.Scanner;

public class B1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long saveB = b;
		long hap = 0;
		long num = 0;
		
		if(c <= b) {
			System.out.println(-1);
		}else {
			b = 0;
			while(hap <= (a+b)) {
				hap += c;
				b += saveB;
				num++;
			}
			System.out.println(num);
		}
	}
}
