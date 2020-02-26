
package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter A or a to display 10 entities per page");
		System.out.println("Enter B or b to display 20 entities per page");
		System.out.println("Enter C or c to display 50 entities per page");
		System.out.println("Enter D or d to display 100 entities per page");
		System.out.println("Enter E or e to display 200 entities per page");
		System.out.println("-------------------------------------");
		System.out.println("Enter:");
		System.out.println("Entities:150" );
		int totalRecord = 150;
		int perRecord = 5;
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		switch(letter) {
		case "a":
		case "A":
			perRecord = 10;
			break;
		case "b":
		case "B":
			perRecord = 20;
			break;
		case "c":
		case "C":
			perRecord = 50;
			break;
		case "d":
		case "D":
			perRecord = 100;
			break;
		case "e":
		case "E":
			perRecord = 200;
			break;
		}
		
		if( totalRecord % perRecord == 0){
			for(int i = 1; i <= totalRecord / perRecord; i++) {
				System.out.println("page" + i  + perRecord);
			}
		}else {
			int page = totalRecord / perRecord;
			for(int i = 1; i <= totalRecord / perRecord; i++) {
				System.out.println("page" + i  + perRecord);
			}
			System.out.println("page" + (page + 1)   + totalRecord % perRecord);
		}

	}

}
