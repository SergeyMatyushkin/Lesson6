package Klient;

import java.io.IOException;
import java.net.Socket;


public class EchoKlient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


