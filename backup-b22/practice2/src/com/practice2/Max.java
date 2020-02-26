package com.practice2;

public class Max {

	public static void main(String[] args) {
		int num[] = {24,89,90, 50};
		int max = num[0];
		int sum = 0;
		for(int i = 0 ; i < num.length; i++) {
			
			if(max < num[i]) {
				max = num[i];	
			sum = sum + num[i];		
			}
			
		}		System.out.println(sum);
		System.out.println(max);
	
		
	}

}
