import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        // Explicit bind on all interfaces
        ServerSocket server = new ServerSocket(5000);
        System.out.println("HTTP Server running on port 5000...");

        while (true) {
            Socket socket = server.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read and print first request line (GET / HTTP/1.1)
            String requestLine = in.readLine();
            System.out.println("Request: " + requestLine);

            String html = "<html><body><h1>Hello from Java on "
                        + InetAddress.getLocalHost().getHostAddress()
                        + "!</h1></body></html>";

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println("Content-Length: " + html.length());
            out.println();
            out.println(html);

            socket.close();
        }
    }
}
