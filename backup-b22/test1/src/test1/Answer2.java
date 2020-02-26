package test1;

public class Answer2 {

	public static void main(String[] args) {
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
		for(int i = 0; i < salary.length; i++) {
			for(int j = i + 1; j < salary.length; j++) {
				if(salary[i] == salary[j]) {
					System.out.println(salary[j]);
				}
			}
		}

	}

}
