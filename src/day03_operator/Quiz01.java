package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		int num, num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력: ");
		num = input.nextInt();
		
		System.out.println("두 수 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("-------------------");
		System.out.println("수 입력 : " + num);
		
		String op;
		op = (num % 2 == 0)?"짝수" : "홀수";
		System.out.println(num + " = " + op);
		
		op = (num % 3 != 0)?"3의 배수가 아니다" : "3의 배수이다.";
		System.out.println(num + " = " + op);

		System.out.println("두 수 입력 : " + num1 + " " + num2);
		System.out.printf("num1 : " + num1 + ", num2 : " + num2);
		System.out.println();
		op = (num1 < num2)?"num2가 num1보다 크다." : "num1이 num2보다 크다.";
		System.out.println(op);
		
	}

}
