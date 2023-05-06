package com;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rst="";
		
		for(int i=ch.length-1;i>=0;i--) {
			int k=i;
			while(i>=0&&ch[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(k>=j) {
				rst=rst+ch[j];
				j++;
			}
			if(i>=0)
				rst=rst+ch[i];
		}
		System.out.println(rst);

	}
	

}
