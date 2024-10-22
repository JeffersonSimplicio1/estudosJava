package Main;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		
		for(int i = 1; i<=N; i++ ) {
			int x = sc.nextInt();
			if(x>=10 && x<=20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		sc.close();
	}

}
