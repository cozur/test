package test;

import java.util.Scanner;

public class firstapp {

	public static void main(String[] args) {
		System.out.println("hello world!");
		Scanner input =new Scanner(System.in);
		//int s =input.nextInt();
		String s=input.next();
		System.out.println(s);
		input.close();

	}

}
