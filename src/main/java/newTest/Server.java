package newTest;

import java.io.*;
import java.net.*;

//服务器端
public class Server {
	static boolean flag = true;
	public static void main(String[] args) throws Exception {
		// 建立服务器ServerSocket
		ServerSocket ss = new ServerSocket(2222);// 8000端口
		System.out.println("服务器启动，等待连接...");
		// 等待连接

		Socket socket = ss.accept();// 连接一旦成功，得到一个(套接字)socket
		System.out.println("连接成功");
		System.out.println("客户端:" + socket.getRemoteSocketAddress());// 显示客户端地址和端口
		InputStream in= null;
		in=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		while (flag) {
			//读取一行
			String msg=br.readLine();
			System.out.println("客户说:"+msg);
			if (msg.equals("quit")) {
				flag = false;
			}
		}

		
		// 关闭
		if (in != null) {
			in.close();
		}
		if (socket != null) {
			socket.close();
		}
		if (ss != null) {
			ss.close();
		}
	}
}

// IP地址:172.13.13.184
