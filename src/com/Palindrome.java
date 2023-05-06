import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
	
	char ch[] = str.toCharArray();
	char ch1[]=new char[str.length()];
		
			for(int i=0;i<str.length();i++) {
				
				ch1[i]=ch[str.length()-1-i];
			}
			String str1 = new String(ch1);
		
			System.out.println(str1);
			
			if(str.equals(str1)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
		}
	}


