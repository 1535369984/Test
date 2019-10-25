package newTest;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	static boolean flag = true;

	public static void main(String[] args) throws Exception {
		// IP地址:172.13.13.184
		// 发送插头Socket给服务器 IP地址，端口号
		System.out.println("客户端发出连接...");
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 2222);// 自动分配端口
		System.out.println("连接成功!");
		OutputStream out = null;
		// 获得输出流
		out = socket.getOutputStream();
		// 转换
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out), true);
		while (flag) {
			// 通信
			System.out.println("我写：");
			String msg = sc.nextLine();

			// 发送
			pw.println(msg);
			System.out.println("信息" + msg + "发送完毕");
			if (msg.equals("quit")) {
				flag = false;
			}
		}
		out.close();
		socket.close();

	}
}
