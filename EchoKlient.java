package Klient;

import java.io.IOException;
import java.net.Socket;


public class EchoKlient {

    public EchoKlient() {

        try {
            Socket socket = new Socket("localhost", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}


