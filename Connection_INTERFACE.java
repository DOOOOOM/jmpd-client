/**
 * The connection class will facilitate communication between the daemon and 
 * the client. 
 */

public interface Connection {
	// constructor
	Connection();

	// initialization overloaded to allow for optional password auth
	public String createConnection(String address, int port);
	public String createConnection(String address, int port, String password);

	// how long the client will attempt to connect before giving up
	public String setConnectionTimeout(Connection conn, int timeout);
	
	// removes all messages
	public void clearConnectionError(Connection conn);

	public void closeConnection(Connection conn);
}
