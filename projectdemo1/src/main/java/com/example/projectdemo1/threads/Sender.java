package com.example.projectdemo1.threads;

public class Sender implements Runnable{
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for(String packet: packets){
            data.send(packet);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
