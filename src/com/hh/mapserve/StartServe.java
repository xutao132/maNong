package com.hh.mapserve;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StartServe {
	private static ExecutorService threadPool = Executors
			.newFixedThreadPool(10000);
	private static String msg = "";

	public static ExecutorService getThreadPool() {
		return threadPool;
	}

	public static void setThreadPool(ExecutorService threadPool) {
		StartServe.threadPool = threadPool;
	}

	public static void main(String[] args) {
		threadPool.execute(new Runnable() {
			public void run() {
				try {
					final ServerSocket RegisterServerSocket = new ServerSocket(
							10088);
					System.out.println("接收客户短消息");
					Socket socket = RegisterServerSocket.accept();
					if (socket != null) {
						threadPool.execute(new RegisterServe(socket));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
