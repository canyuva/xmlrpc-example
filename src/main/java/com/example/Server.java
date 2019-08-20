package com.example;

import org.apache.xmlrpc.*;

public class Server {

    public String getMessage(String msg){
        return msg;
    }

    public static void main(String[] args) {
        System.out.println("Attempting to start XML-RPC Server...");

        WebServer server = new WebServer(5300);
        server.addHandler("myServer", new Server());
        server.start();

        System.out.println("Started successfully.");
        System.out.println("Accepting requests. (Halt program to stop.)");
    }
}
