package com.sorting.bubble;

import java.util.Arrays;

public class Sort_String {
	static void sort(String[] S) {
		int n = S.length;
		boolean flag;
		for (int i = 0; i < n - 1; i++) {
			flag = false;
			for (int j = 1; j < n - i; j++) {
				int previous = j - 1;
				int a=S[previous].length();
				int b=S[j].length();
				if (S[previous].length() > S[j].length()) {
					String temp = S[previous];
					S[previous] = S[j];
					S[j] = temp;
					flag = true;
				}
			}
			if(!flag)
			{
			break;	
			}
		}
	}
public static void main(String[] args) {
	String[] s= {"aa", "b", "c", "bb"};
	sort(s);
	System.out.println(Arrays.toString(s));
}
}
