package SocketDemo;
import java.util.*;
public class Main {
 
    public static void main(String args[])
    {
        //if(args.length==0)
            System.out.println("�жǤJ�Ѽ�server��client");
        String choice;
        Scanner inputString = new Scanner(System.in);
        choice = inputString.nextLine();
        if(choice.equals("server"))
            (new SocketServer()).start();
        else
            new SocketClient();
    }
}