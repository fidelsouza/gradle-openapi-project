package com.example.projectdemo1.threads;

public class TestMainThreads {

    public static void main(String[] args)
    {
//        Data d = new Data();
//        new Thread( new Sender(d)).start();
//        new Thread( new Receiver(d)).start();

        Data data = new Data();
        data.setPacket("Packet A");

        Sender senderCarro = new Sender(data);
        Sender senderMoto = new Sender(data);

        senderMoto.getData().setPacket("packet é uma moto ");

        System.out.println("SenderCarro: "+senderCarro.getData().getPacket());
    }
}
