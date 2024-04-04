import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try{
        System.out.println("Waiting for clients...");
        ServerSocket ss = new ServerSocket(9086);
        Socket soc = ss.accept();
        System.out.println("Connection Established");
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main
}//class
