package com.perscholas;

import java.util.*;

public class StringIntroduction {

	// https://www.hackerrank.com/challenges/java-strings-introduction/problem

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int length = A.length() + B.length();
		System.out.println(length);
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else
			System.out.println("No");
		String a = A.substring(0, 1).toUpperCase() + A.substring(1);
		String b = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(a + " " + b);
	}

}
