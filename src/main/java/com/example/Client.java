package com.example;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Scanner;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        try {
            XmlRpcClient client = new XmlRpcClient("http://localhost:5300/");
            Vector params = new Vector();

            Scanner sc = new Scanner(System.in);
            System.out.println("Type a message : ");
            String msg = sc.nextLine();
            params.addElement(msg);


            // Send message to server with method name
            Object result = client.execute("myServer.getMessage", params);
            params.clear();

            System.out.println("Your message : "+result);

        } catch (Exception exception) {
            System.err.println("JavaClient: " + exception);
        }

    }
}
