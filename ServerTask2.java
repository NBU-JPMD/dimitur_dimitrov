/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertask2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dimitur
 */
public class ServerTask2 {

        private int currentTot;
    ServerSocket s;
    Socket cs;
    int bytesRead;
    Loggin log = new Loggin();
    BufferedReader input;
    PrintWriter output;

    public void start() throws IOException{
        System.out.println("Connection Starting on port:" + log.getPort());
       
        s = new ServerSocket(log.getPort());

        
        cs = s.accept();

        System.out.println("Waiting for connection from client");

        try {
            logInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

        
        public void logInfo() throws IOException{
          input = new BufferedReader(new InputStreamReader(cs.getInputStream()));
          String username = input.readLine();
          String password = input.readLine();
        }
        
        public void stop(){
         ExecutorService exec = Executors.newCachedThreadPool();
         exec.shutdownNow();
        }
        
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
    }

    public ServerTask2() throws IOException {
        this.s = new ServerSocket(7800);
    }
    
}
