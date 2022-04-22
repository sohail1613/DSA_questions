package com.oops.introduction.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CdPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void StopMusic(){
        player.stop();
    }

    public void upGradeEngine(){
        this.engine = new ElectricEngine();
    }
}
