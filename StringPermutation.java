
public class StringPermutation {

	public static void main(String[] args) {
		
		String input ="top";
		String input2 ="pot";
    //check null and empty
		helper("",input,input2);
	}

	private static void helper(String prefix, String input,String input2) {
		
		if(input.length()==0  && prefix.equals(input2)) {
			System.out.println(prefix);
		}else {
			for(int i=0;i<input.length();i++) {
				helper( prefix+input.charAt(i), input.substring(0, i)+input.substring(i+1),input2);
				
			}
		}
		
	}
}
