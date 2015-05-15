package challenge.code;

@SuppressWarnings("serial")
public class InvalidMessageException extends Exception {

	String errStr;
	
	public InvalidMessageException(String str){
		errStr = str;
	}
	
	public String toString(){
		
		return errStr;
	}
}
