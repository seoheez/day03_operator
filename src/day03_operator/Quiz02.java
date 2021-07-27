package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		int num, num1, num2, numb1, numb2, numb3;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 1개 입력: ");
		num = input.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수 입니다.");	
		}
		if(num % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		if(num > 0) {
			System.out.println("절대값: " + num);
		} 
		if(num < 0) {
			System.out.println("절대값: " + Math.abs(num)); //num * -1
		}
		System.out.println("-----------------");
		System.out.println("숫자 2개 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		if(num1 > num2) {
			System.out.println("더 큰 수: " + num1);
			if(num1 % 2 == 0) {
				System.out.println(num1 + "은 짝수입니다.");
			}
		}
		if(num2 > num1) {
			System.out.println("더 큰 수: " + num2);
			if(num2 % 2 == 0) {
				System.out.println(num2 + "은 짝수입니다.");
			}
		}
		
		if((num1 + num2)%2 == 0 && (num1 + num2) %3 == 0) {
			System.out.println(num1 + ", " 
					 + num2 + "은 두 수의 합이 짝수이면서 3의 배수입니다.");
		}
		
		
		System.out.println("-----------------");
		System.out.println("숫자 3개 입력: ");
		numb1 = input.nextInt();
		numb2 = input.nextInt();
		numb3 = input.nextInt();

		if(numb1 > numb2 && numb1 > numb3) {
			System.out.println(numb1 + "이 가장 큰 수 입니다.");
		}

			
		if(numb2 > numb1 && numb2 > numb3) {
			System.out.println(numb2 + "이 가장 큰 수 입니다.");
		}
			
		if(numb3 > numb1 && numb3 > numb2) {
			System.out.println(numb3 + "이 가장 큰 수 입니다.");
		}
				
	
		
	}

}
