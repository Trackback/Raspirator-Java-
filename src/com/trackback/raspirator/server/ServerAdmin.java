package com.trackback.raspirator.server;

import java.net.InetAddress;
import java.net.ServerSocket;

import com.trackback.raspirator.console.Interpreter;
import com.trackback.raspirator.settings.Settings;
import com.trackback.raspirator.tools.D;

public class ServerAdmin {
	

    public static void init(Interpreter interpreter){
        try{
            int i = 0;
            ServerSocket server = new ServerSocket(Settings.SERVER_PORT, 0, InetAddress.getByName("localhost"));

            D.log("Black Admin", "I'm waiting for the master");
            while(true){
                Server s =   new Server(i, server.accept());
                s.setListner(interpreter.getGetRequestListner());
                interpreter.setServerBridg(s);
                i++;
            }
        }
        catch(Exception e){
        	D.log("Black Admin", "Opps! Master is die");
        	e.printStackTrace();
        }
    }
}