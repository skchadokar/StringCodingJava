/**
one way : there are three type of edits that can be performed on string : insert a char remove a char or replace a char.
Given two string write a function if they are edit pr zero edit way..
pale,ple ->true
pales,pale ->true
pale,bale ->true
pale,bake ->false


*/

public class OneAwayString {

	public static void main(String[] args) {
		String s1="pale";
		String s2="bale";
		int i=0;
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		while(i<sb1.length()) {
			if(sb2.indexOf(sb1.charAt(i)+"")>-1) {
				sb2= sb2.deleteCharAt(sb2.indexOf(sb1.charAt(i)+""));
				sb1= sb1.deleteCharAt(sb1.indexOf(sb1.charAt(i)+""));
			}else {
				i++;
			}
		}
		System.out.println(sb1.length()<2 && sb2.length()<2);
	}
}
