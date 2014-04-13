import dooooom.jmpd.client.ConnectionController;

public class ConnectionControllerJSONEchoTest2 {
	public static void main(String[] args) throws Exception {
		ConnectionController cc = new ConnectionController("localhost", 4444);

		String response = cc.sendMsg("hullo\n");

		System.out.println(response);
	}
}
