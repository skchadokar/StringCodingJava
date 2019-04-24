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
		while(i<s1.length()) {
			if(s2.indexOf(s1.charAt(i))>-1) {
				s2= s2.replace(s1.charAt(i)+"", "");
				s1 = s1.replace(s1.charAt(i)+"", "");
			}else {
				i++;
			}
		}
		System.out.println(s1.length()<2 && s2.length()<2);
	}
}
