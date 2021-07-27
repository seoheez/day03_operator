package day03_operator;

public class Ex03_Op {

	public static void main(String[] args) {

		/*
		 * 복합 대입 연산자
		   	a = 10;
		   	a(13) = a(10) + 3; -> a+= 3;
		   	a = a * 3; -> a*= 3;
		   ...
		 */

		int su1, su2;
		su1=su2=5;
		System.out.println("su1+1=" + (su1+=1) ); 	//6
		System.out.println("su1-1=" + (su1-=1) ); 	//5
		System.out.println("su1*su2=" + (su1*=su2) );	//25
		System.out.println("su1/su2=" + (su1/=su2) ); 	//5
		System.out.println("su1%su2=" + (su1%=su2) );	//0
	}

}
