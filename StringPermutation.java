
public class StringPermutation {

	public static void main(String[] args) {
		
		String mInput ="top";
		String mInput2 ="pot";
		//check empty and null
		helper("",mInput,mInput2);
	}

	private static void helper(String aPrefix, String aInput,String aInput2) {
		
		if(aInput.length()==0  && aPrefix.equals(aInput2)) {
			System.out.println(aPrefix);
		}else {
			for(int i=0;i<aInput.length();i++) {
				helper( aPrefix+aInput.charAt(i), aInput.substring(0, i)+aInput.substring(i+1),aInput2);
				
			}
		}
		
	}
}
