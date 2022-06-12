package com.example.projekt;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;
    ServerSocket serverSocket;
    Socket socket;
    public Server(ServerSocket serverSocket) {
        try {
            this.serverSocket = serverSocket;
            this.socket = serverSocket.accept();
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error server server");
        }
    }
/*
    public void sendMessageToClient(AnchorPane messageToClient, ImageView aa) {
        try {
           bufferedWriter.write(String.valueOf(messageToClient));
           bufferedWriter.write(String.valueOf(aa));
           bufferedWriter.newLine();
           bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            //closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }

    public void receiveMessageFromClient(AnchorPane id2, ImageView aa) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    System.out.println(aa);

                }
            }
        }).start();
    }
    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (socket != null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
