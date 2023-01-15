package Assignment_java;

import java.util.Scanner;

public class greatest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Find A Greatest Number");
		
		System.out.print("Enter Number 1:- ");
		int m1=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Number 2:- ");
		int m2=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Number 3:- ");
		int m3=Integer.parseInt(sc.nextLine());
		
		//System.out.println(m1+" "+m2+" "+m3);
		if (m1 > m2 && m1 > m3) {
			System.out.println(m1+" IS A GREATEST NUMBER");	
		}
		else if (m2 > m1 && m2 > m3) {
			System.out.println(m2+" IS A GREATEST NUMBER");	
		}
		else {
			if (m1==0&&m2==0&&m3==0) {
				System.out.println("ENTER NUMBERS IS ZERO");
			}
			else if (m1<0&&m2<0&&m3<0) {
				System.out.println("ENTER NUMBERS IS NEGATIVE");
			}
			else if (m3 > m1 && m3 > m2) {
				System.out.println(m3+" IS A GREATEST NUMBER");	
			}	
		}
	}
}
