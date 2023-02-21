package Exceptions;

/**
 * This class creates an empty room exception that extends to Exception.
 * @author Antonela Diomedi
 *
 */
@SuppressWarnings("serial")
public class VoidRoomException extends Exception {
	
	/**
	 * This constructor initializes the empty room exception.
	 * @param msg is the message emitted by the method that threw the exception.
	 */
	public VoidRoomException(String msg) {
		super(msg);
	}

}
