
//google
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
	System.out.println(getUniqueCharacterSubstring("xabbabdd")); 
		
	}
	
	static String getUniqueCharacterSubstring(String aInputString) {
		
		int mSlowPointer = 0,mFastPointer=0;
		String mOutPut ="";
		Map<Character,Integer> mVisitedMap=  new HashMap<>();
		while(mSlowPointer<aInputString.length() && mFastPointer<aInputString.length()) {
			char mCurrentChar = aInputString.charAt(mFastPointer);
			if(mVisitedMap.containsKey(mCurrentChar)) {
				mSlowPointer=Math.max(mVisitedMap.get(mCurrentChar)+1,mSlowPointer);//very imp 
			}
				mVisitedMap.put(mCurrentChar, mFastPointer);
			
				if(mOutPut.length()<Math.abs(mFastPointer-mSlowPointer)+1) {
					mOutPut = aInputString.substring(mSlowPointer,mFastPointer+1);//new String
			}
			mFastPointer++;
		}
		return mOutPut;
		
	}

}
