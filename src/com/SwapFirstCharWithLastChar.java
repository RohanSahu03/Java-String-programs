package com;

import java.util.Scanner;

public class SwapFirstCharWithLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string : ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char c =ch[f];
				ch[f]=ch[i];
				ch[i]=c;
			}
		}
		st=new String(ch);
		System.out.println(st);
	}
//Ram is a good boy   k=0
	//j=1
	//1>0
}
