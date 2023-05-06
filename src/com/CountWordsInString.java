package com;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string : ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
			{
					count++;
			}
			
			}
		System.out.println(count);
	}

}
