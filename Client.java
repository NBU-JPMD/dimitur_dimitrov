/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;

/**
 *
 * @author Dimitur
 */
public class Client {

    try{
        Socet s = new Socet("client", 8888);
            PrintWriter printWr = new PrintWriter(s.getOutputStream());
            printWr.println("Print");
            printWr.println();
            printWr.flush();
}catch (UnknownHostException e){}
catch(IOExeption e){}
    



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
