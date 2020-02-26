import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key:");
		 //char letter = sc.next().charAt(0); 
		String text = sc.nextLine();
		
		int totalEntities = 150;
		int perEntities = 5;
		
		switch(text) {
		case "a":
		case "A":
			perEntities = 10;
			break;
		case "b":
		case "B":
			perEntities = 20;
			break;
		case "c":
		case "C":
			perEntities = 50;
			break;
		case "d":
		case "D":
			perEntities = 100;
			break;
		case "e":
		case "E":
			perEntities = 200;
		}
		for(int i = 0; i < totalEntities / perEntities;i++) {
			System.out.println(perEntities);
			if()
		
		}
}
}