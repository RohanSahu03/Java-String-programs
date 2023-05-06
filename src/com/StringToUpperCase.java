package com;

import java.util.Scanner;

public class StringToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string : ");
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		char []ch =st.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		st=new String(ch);
		System.out.println(st);

	}

}
