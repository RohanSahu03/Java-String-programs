package com;

import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string : ");
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]>='0'&&ch[i]<='9') && !(ch[i]>='a'&&ch[i]<='z') && !(ch[i]>='A'&&ch[i]<='Z'))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
