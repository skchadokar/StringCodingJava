
public class LongestPalindrome {
static int maxlen =1;
static String maxlenop =null;
	public static void main(String[] args) {
		
		String s = "aabaab";
		helper(s);//using recursion 
	  helper("",s,s);//using dynamic programming
		System.out.println(maxlenop+"="+maxlen);
		System.out.println();
	}
	 
	
	private static void helper(String prefix, String s,String oS) {
	    int n = s.length();
	    if(prefix.equals(new StringBuilder(prefix).reverse().toString()) && prefix.length()>maxlen && oS.indexOf(prefix)>-1) {
	    	maxlenop =prefix;
	    	maxlen = prefix.length();
	    }
		if(n>0) {
			for(int i=0;i<n;i++) {
				 helper(prefix+s.charAt(i),  s.substring(0, i)+s.substring(i+1,n),oS);
			}
		}
		
	}
	
	private static void helper(String s) {
		if(s==null||s.length()==0) return;
		int mLen = s.length();
		int r =0,l=0;
		boolean table[][]=new boolean[mLen][mLen];
		for(int i=0;i<mLen;i++) {
			table[i][i] = true;
		}
		for(int j=1;j<mLen;j++) {
			for(int i=0;i<j;i++) {
			 boolean isAvlPalWord = table[i+1][j-1] || j-i<2;
			 if(s.charAt(i)==s.charAt(j) && isAvlPalWord) {
				 table[i][j] = true;
				 if(j-i>r-l) {
					 r=j;
					 l=i;
				 }
			 }
			}
		}
		System.out.println(s.substring(l, r+1));
 }
}
