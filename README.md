# Création du serveur

Lorsque le serveur est lancé, il affiche "Je suis un serveur en attente de la connexion d'un client...".
Après qu’un client se connecte, le serveur affiche "Un client est connecte !" puis "Connexion fermee.".
Le serveur se ferme ensuite. Cela montre que la communication de base entre un serveur et un client est bien établie, mais pour le moment, aucune donnée n’est échangée.

---

## Serveur.java

1. Compile the server:

   ```java
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
# Création du client

The server listens for incoming client connections, and the client connects to the server. When a connection is established,
both server and client print messages to indicate the connection and disconnection. This example shows how to create sockets,
handle connections, and close them properly, but no actual data is exchanged.

---

## Client.java

1. Compile the client:

   ```java
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



        }

