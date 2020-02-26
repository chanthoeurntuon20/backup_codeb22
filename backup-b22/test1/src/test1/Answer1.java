package test1;

public class Answer1 {

	public static void main(String[] args) {
		int score[] = {90,80,50,40,70,30,60};
		int fail = 0;
		int pass = 0;
		int higherScore = score[0];
		int lowerScore = score[0];
		int sum = 0;
	
		double agrc = 0;
		for(int i = 0 ; i < score.length;i++) {
			if(score[i]< 50) {
				fail++;
			}else {
				pass++;
			}
			if(higherScore < score[i]) {
				higherScore = score[i];
			}
			if(lowerScore > score[i]) {
				lowerScore = score[i];
			}
			sum += score[i];
			agrc = sum / score.length;
			
		}
		System.out.println("The number of students fail:" + fail);
		System.out.println("The number of students pass:" + pass);
		System.out.println("The number of students higher score:" + higherScore);
		System.out.println("The number of students lower score:" + lowerScore);
		System.out.println("The number of students agrc score:" + agrc);

	}

}
