//google interview
//String inputString = "XYZCDFGABHKERYT";	
//String  searchPattrn= "ABCDFGHK"; find start index of this pattern in given input string

public class FindPatternInGivenString{
static int iIndexOfPattern=-1;
  public static void main (String [] arg){
    String mInputString = "XYZCDFGABHKERYT";	
    String mSearchPattrn= "ABCDFGHK";
    new FindPatternInGivenString().getIndexOfPatternInGivenString("",mInputString,mSearchPattrn);
    System.out.println(iIndexOfPattern);
  }

private void permutation(String aPrefix, String aPattn, String aInString) {
		 if(aPrefix==null && aPattn==null && aInString==null) {
			 return;
		 }
		int n = aPattn.length();
		if (n == 0 && aInString.indexOf(aPrefix)>-1 ) {
			iIndexOfPattern =aInString.indexOf(aPrefix);
		    permutation(null, null,null);
		    } else {
		        for (int i = 0; i < n; i++) {
		            permutation(aPrefix + aPattn.charAt(i), aPattn.substring(0, i) + aPattn.substring(i+1, n),aInString);
		        }
		   }
		
	}
}
