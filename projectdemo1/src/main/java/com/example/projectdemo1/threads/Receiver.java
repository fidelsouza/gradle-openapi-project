package com.example.projectdemo1.threads;

public class Receiver implements Runnable{

    private Data data;

    public Receiver(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        for(var ret = data.receive(); ret!="End"; ret = data.receive()){
            System.out.println(ret);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
