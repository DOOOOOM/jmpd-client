public interface Message {
	private String status;
	private String command;
	private String[] params;

	public String createMessage(String status, String command, String[] params);
	public String sendMessage(Connection conn);
}
