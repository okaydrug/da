/*
Сервер рассылает сообщения только тем клиентам, которые в настоящий момент находятся в online.
*/

import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Клиент подключен к серверу " + SERVER_ADDRESS + " на порту " + SERVER_PORT);
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Сервер: " + in.readLine());
        }
        out.close();
        in.close();
        stdIn.close();
        socket.close();
    }
}
