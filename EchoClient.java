
import java.net.Socket;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket soc = new Socket("localhost", 9086);
            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String : ");
            String str = userinput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// main
}// class
