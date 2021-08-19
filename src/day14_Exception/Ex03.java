package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,result;
			try {
				System.out.print("x 수입력 : ");
				x = input.nextInt();
				System.out.print("y 수입력 : ");
		y = input.nextInt();
		result = x/y;
		System.out.println("x / y = "+result);
		return;
			}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("0으로 나눌수는 없습니다");
			return;
		}finally {
			System.out.println("마지막에 수행");
		}
		//System.out.println("다음 문장들 실행~");
		}
	
}
