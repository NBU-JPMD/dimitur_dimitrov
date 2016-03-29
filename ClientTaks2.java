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
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimitur
 */
public class ClientTaks2 {
    
        String sentence;
        String modifiedSentence;
        Loggin log = new Loggin();
         BufferedReader read;
        PrintWriter output;
        while(true){
        try {
            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
            
            Socket cs = new Socket(log.getHostname(), log.getPort());
            
                output = new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));
           
            
             String username = JOptionPane.showInputDialog(null, "Enter User Name:");
             
             output.println(username);
             
             String password = JOptionPane.showInputDialog(null, "Enter Password");
             
             output.println(password);
             output.flush();
             
            System.out.println("Ready");
            sentence = userIn.readLine();
            output.write(sentence);
            modifiedSentence = userIn.readLine();
            System.out.println(modifiedSentence);
        } catch (IOException ex) {
            Logger.getLogger(ClientTaks2.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
      cs.close();
    
}
