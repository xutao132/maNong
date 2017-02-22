package com.hh.mapserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import com.alibaba.fastjson.JSON;
import com.hh.entity.JsonBean;
import com.hh.entity.User;

public class RegisterServe implements IServer {
	private Socket socket = null;
	public RegisterServe(Socket socket) {
		this.socket = socket;
	}
	public void run(){
		String message = null;
		try {
			message = ReciveMessage();//接收客户端发来的消息的方法
			sendMessage(message);//发送消息到客户端的方法
		} catch (Exception e) {
			System.out.println(e.getMessage());
			JsonBean jsonBean = new JsonBean(401, 0, "", e.getMessage());
			message = JSON.toJSONString(jsonBean)+"\n";
			sendMessage(message	);//当有异常时将异常数据发送到客户端
		}
}

	private String ReciveMessage() {
		String message = receiveString();
		User user = register(message);
		JsonBean jsonBean = new JsonBean(210, 0, "", "注册成功");
		System.out.println(user.getUid());
		jsonBean.setUser(user);
		String userJson = JSON.toJSONString(jsonBean)+"\n";
		return userJson;
	}
	public void sendMessage(String jsonMessage){
		// TODO Auto-generated method stub
		
	}
	
	
	private String receiveString() {
		try {
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private User register(String message) {
		return null;
	}
	public void sendMessage(String jsonMessage, Socket socket) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
