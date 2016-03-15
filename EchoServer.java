/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoserver;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

        
/**
 *
 * @author Dimitur
 */
public class EchoServer  throws IOException {
 FileChannel fcin = fin.getChannel();
     FileChannel fcout = fout.getChannel();   
     
     ByteBuffer buffer = ByteBuffer.allocate(1024);
     
     while(true){
     buffer.clear();
     int r = fcin.read(buffer);
     if (r==-1){break;}
     buffer.flip();
     fcout.write(buffer);
     
     }
     try{
         ServerSocket sS = new ServerSocket(8888);
         Socket s = sS.accept();
         BufferedInputStream in = new BufferedInputStream(s.getInputStream());
         ByteArrayOutputStream bOut = new ByteArrayOutputStream();
         byte[] b = new byte [1024];
         int r = 0; 
         while((r = in.read(b)) != -1){
         bOut.write(b, 0, r);        
         }
     }catch(IOException i){}
     
     try{
     PrintWriter pw = new PrintWriter(s.getOutputStream());
     pw.println("Hello");
     pw.flush();
     pw.close();
     in.close();
     s.close();
     }catch(IOException e){}
     
     try{
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            while((line = b.readLine())!=null){
                System.out.println(line);
            }
            pw.close();
            b.close();
            s.close();
            

}catch(IOException e){}
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
}
}