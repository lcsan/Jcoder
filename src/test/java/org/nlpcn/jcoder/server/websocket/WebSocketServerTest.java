package org.nlpcn.jcoder.server.websocket;

import org.junit.Test;
import org.nlpcn.jcoder.server.rpc.ChannelManager;
import org.nlpcn.jcoder.server.rpc.websocket.WebSocketServer;

public class WebSocketServerTest {

	@Test
	public void test() throws Exception {
		WebSocketServer.startServer(8081);
		Thread.sleep(1000000);
	}

}
