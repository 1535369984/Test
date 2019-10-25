package test.serve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<ServerThread> clients;

	public static void main(String[] args) {
		new Server().startUp();
	}

	private void startUp() {

		ServerSocket ss = null;
		Socket s = null;
		try {
			ss = new ServerSocket(1234);
			System.out.println("等待服务。。。");
			clients = new ArrayList<ServerThread>();
			while (true) {
				s = ss.accept();
				ServerThread st = new ServerThread(s);
				new Thread(st).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private class ServerThread implements Runnable {
		private BufferedReader br;
		private PrintWriter pw;
		private Socket s;
		private String name;
		private boolean flag = true;

		public ServerThread(Socket socket) throws IOException {
			this.s = socket;
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			name = br.readLine() + "[" + socket.getLocalAddress().getHostName() + socket.getLocalPort() + "]";
			clients.add(this);
			send(name + "上线了");
		}

		private void send(String msg) {
			for (ServerThread serverThread : clients) {
				System.out.println(msg);
			}

		}

		private void receive() throws Exception {
			String str = null;
			while ((str = br.readLine()) != null) {
				if (str.equalsIgnoreCase("quit")) {
					this.flag = false;
					stop();
					pw.println("disconnect");
					break;
				}
			}
			send(name + ":" + str);
		}

		private void stop() {
			clients.remove(this);
			flag = false;
			send(name + "已经下线了");
		}

		@Override
		public void run() {
			try {
				while (true) {
					if (!flag) {
						break;
					}
					receive();
				}
			} catch (Exception e) {
				e.printStackTrace();
				stop();
			} finally {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
