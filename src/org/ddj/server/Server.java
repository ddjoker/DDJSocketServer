package org.ddj.server;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by dong on 2016/8/4.
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(10086);

            while (true){
                ss.accept();
                doAction(ss);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doAction(ServerSocket ss) {

    }
}
