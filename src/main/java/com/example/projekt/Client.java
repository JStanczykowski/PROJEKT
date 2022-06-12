package com.example.projekt;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.*;
import java.net.Socket;

public class Client {
    Socket socket;
    InputStreamReader inputStreamReader = null;
    OutputStreamWriter outputStreamWriter = null;
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;
    {
        try {
            socket = new Socket("localhost", 1234);

            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            while(true) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Client(Socket localhost) {
    }

    public void sendMessageToServer(AnchorPane anch, ImageView aa) {
        System.out.println("client"+aa);

    }

    public void receiveMessageFromServer(GridPane gridPlansza, AnchorPane id2) {
        System.out.println("cleint"+id2);
    }
}
