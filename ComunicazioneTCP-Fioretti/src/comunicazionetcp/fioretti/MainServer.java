/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class MainServer {
    public static void main(String[] args) {
        Server server = new Server(12345);
        server.attendi();
        server.leggi();
        server.scrivi("Ciao dal server!");
        server.chiudi();
        server.termina();
    }
}
