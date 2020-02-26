import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		int totalRecord = 150;
		int recordPerPage = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		char enter = sc.next().charAt(0);
		switch(enter) {
		case 'a':
		case'A':
			recordPerPage = 10;
			break;
		case 'b':
		case'B':
			recordPerPage = 20;
			break;
		case 'c':
		case'C':
			recordPerPage = 50;
			break;
			
		case 'd':
		case'D':
			recordPerPage = 100;
			break;
		case 'e':
		case'E':
			recordPerPage = 200;
			break;
		}
		
		if( totalRecord % recordPerPage == 0 ){
			for(int i = 1 ;i<= totalRecord/recordPerPage ;i++) {
				System.out.print("|Page" + i + ":" + recordPerPage);
			}
			System.out.print("|");
		}else {
			int page = totalRecord / recordPerPage;
			for(int i = 1 ;i<=page ;i++) {
				System.out.print("|Page" + i + ":" + recordPerPage);
			}
			System.out.print("|Page" + (page+ 1)+":" + totalRecord%recordPerPage+ "|");
		}
		}

	}
	