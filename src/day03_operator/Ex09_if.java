package day03_operator;

import java.util.Scanner;

public class Ex09_if {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		num = input.nextInt();
		if(num > 10) { // 하나의 문장만 종속문장으로 생각한다.
			System.out.println("1종속 문장 실행");  // 참이면 모든 문장 실행
			System.out.println("2종속 문장 실행"); 
			System.out.println("3종속 문장 실행"); 
			System.out.println("4종속 문장 실행"); 
		}
		System.out.println("다음 문장들 실행"); // 거짓이면 이 문장만 실행
		
	}

}
