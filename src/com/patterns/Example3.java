package com.patterns;

public class Example3 {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=9-i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
