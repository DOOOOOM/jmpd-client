import static org.junit.Assert.*;

import org.junit.Test;

import dooooom.jmpd.client.ConnectionController;


public class ConnectionControllerJSONEchoTest {
	@Test
	public void test() throws Exception {
		ConnectionController cc = new ConnectionController("localhost", 4445);
		
		String response = cc.sendMsg("hullo\n");
		
		System.out.println(response);
	}
}
