import java.net.*;
import java.io.*;

public class TCPClient {
    private Socket connection;

    public boolean connect(Strig host, int port) {
        try{
            Socket socket = newSocket(host, port);
            System.out.println("Successfully connected");

            connection = socket;

        } catch (IOException e) {
            System.out.println("Socket error: " + e.getMessage());
            lastError = "" + e;
        }
    }
}
