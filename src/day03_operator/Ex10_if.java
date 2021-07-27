package day03_operator;

import java.util.Scanner;

public class Ex10_if {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		num = input.nextInt();
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		if(num%2 != 0) {
			System.out.println("홀수");
		}
				
		
	}

}
