/**
 * The Message class neatly encapsulates data so that it may be
 * easily sent over the client-server connection.
 */

public interface Message {
	// constructor
	public Message(String status, String command, String[] params);

	// sends a message to the other program over the connection
	public String sendMessage(Connection conn);
}
