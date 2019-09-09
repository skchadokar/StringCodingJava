package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class StringConvertPlindrome {

	public static void main(String[] args) {
		String s = "abcbc";

		
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int i=0;
		while(sb.length()>i) {
			char currChar = sb.charAt(i);
			if(sb.indexOf(currChar+"")!=sb.lastIndexOf(currChar+"")) {
				sb = sb.deleteCharAt(sb.indexOf(currChar+""));
				sb1.append(currChar+"");
				sb = sb.deleteCharAt(sb.indexOf(currChar+""));
				sb2.append(currChar+"");
			}else
			i++;
		}
		System.out.println(sb);
		System.out.println(sb.length()>1?false:true);
		if(sb.length()>1) {
			sb = sb1.append(sb).append(sb2.reverse());
			System.out.println(sb);
		}
	}
}
