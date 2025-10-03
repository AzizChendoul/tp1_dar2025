package serverPackage;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // creation du serveur
            ServerSocket serveur = new ServerSocket(80);
            System.out.println("Je suis un serveur en attente de la connexion d'un client...");

            // Accepter le client
            Socket socket = serveur.accept(); 
            System.out.println("Un client est connecte !");

            // Fermer la socket
            socket.close();
            System.out.println("Connexion fermee.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
