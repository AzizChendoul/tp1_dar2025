package clientPackage;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
        try {
            System.out.println("Je suis un client pas encore connecte…");

            // Connexion au serveur
            Socket socket = new Socket("localhost", 80);

            // Cnnexion est reussie
            System.out.println("Je suis un client connecte !");

            // Fermer socket
            socket.close();
            System.out.println("Connexion fermee par le client.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
