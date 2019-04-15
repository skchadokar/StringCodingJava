//google interview

public class EncodeString {

	public static void main(String[] args) {
		String mInputString = "aabbcb";//2xa2xbcb
		char mOldChar = mInputString.charAt(0);
		int mCount=0;
		StringBuilder mFinalOutPut = new StringBuilder();
		for(int i=0;i<mInputString.length();i++) {
			if(mOldChar==mInputString.charAt(i)) {
				mCount++;
			}else {
				if(mCount>1) {
					mFinalOutPut.append(mCount+"x").append(mOldChar);
				}else {
					mFinalOutPut.append(mOldChar);
				}
				mOldChar = mInputString.charAt(i);
				mCount=1;
			}
		}
	
		System.out.println(mFinalOutPut);
	}
}
