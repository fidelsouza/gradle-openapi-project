package com.example.projectdemo1.threads;

public class Data {
    private String packet;

    private boolean transfer = true;

    public synchronized String receive(){

        while(transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        String returnPacket =this.packet;
        transfer = true;
         notifyAll();
         return returnPacket;

    }

    public synchronized void send(String packet){

        while (!transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        transfer = false;
        this.packet = packet;
        notifyAll();

    }

    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }
}
