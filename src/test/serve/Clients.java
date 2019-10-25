package test.serve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Clients {
	private Socket s;
	private BufferedReader br;
	private PrintWriter pw;
	private boolean flag = true;

	// private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Clients().startUp();
	}

	private void startUp() {
		BufferedReader sbr = null;
		try {
			s = new Socket("127.0.0.1", 1234);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("小王");
			sbr = new BufferedReader(new InputStreamReader(System.in));
			new Thread(new ClientThread()).start();
			String str = null;
			while (flag && (str = sbr.readLine()) != null) {
				if (!flag)
					break;
				pw.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null)
					s.close();
				if (sbr != null)
					sbr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	private void receive() {
		try {
			String rs = br.readLine();
			if (rs.equalsIgnoreCase("disconnect")) {
				flag = false;
				System.out.println("点击回车退出");
			}
			System.out.println(rs);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private class ClientThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				if (!flag) {
					break;
				}
				receive();
			}
		}

	}
}
