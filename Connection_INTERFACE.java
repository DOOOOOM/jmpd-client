public interface Connection {

	Connection(String address, int port, int timeout);
	Connection(String address, int port, String password, int timeout);

	public String createConnection(String address, int port);
	public String createConnection(String address, int port, String password);

	public String setConnectionTimeout(Connection conn, int timeout);
	
	public void clearConnectionError(Connection conn);

	public void closeConnection(Connection conn);
}
