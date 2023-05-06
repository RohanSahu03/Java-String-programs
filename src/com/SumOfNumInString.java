package com;

import java.util.Scanner;

//input - er5fd67ds2
//output - 74

public class SumOfNumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter string : ");
			Scanner sc = new Scanner(System.in);
			String st=sc.next();
			char ch[]= st.toCharArray();	
			int sum=0;
			for(int i=0;i<ch.length;i++) {
				String n="";
				
				while(i<ch.length && ch[i]>='1'&& ch[i]<='9' ) {
					n=n+ch[i];
					i++;
				}
				int x=0;
				for(int j=0;j<n.length();j++) {
					x=x*10+n.charAt(j)-'0';
				}
				sum=sum+x;
			}
			System.out.println(sum);
	}

}
