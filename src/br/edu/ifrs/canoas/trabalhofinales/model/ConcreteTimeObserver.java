package br.edu.ifrs.canoas.trabalhofinales.model;

import java.util.Random;

public class ConcreteTimeObserver implements TimeObserver{
    public static final double STOP_CHANCE = 0.1;
    public static final double VEHICLE_CHANCE = 0.5;
    public static final int STOP_TIME = 20;
    public static final int GO_TIME = 30;
    int greenCounter = 0;
    int redCounter = 0;
    int requests = 0;
    
    @Override
    public void timeChanged(int newTime) {
        Signal signal = new LightSignal();
        Random random = new Random();
        
        VehicleQueue queue = new VehicleQueue(
                VEHICLE_CHANCE,
                new ConcreteVehicleFactory()
        );
        
        queue.enter();
        
        switch (signal.getState()) {
            case Signal.GO:
                greenCounter++;
                queue.leave();
                break;
            case Signal.CAUTION:
                signal.changeState();
                break;
            case Signal.STOP:
                if(redCounter < STOP_TIME)
                    redCounter++;
                else{
                    redCounter = 0;
                    signal.changeState();
                }                    
                break;
        }
        
        if(random.nextDouble() <= STOP_CHANCE){
            requests++;
            if(greenCounter >= GO_TIME){
                signal.requestHaltLine();
                greenCounter = 0;
                requests = 0;
            }
        }
        
        System.out.println("Tempo atual: "+newTime);
        System.out.println("Tamanho da fila: "+queue.getLenght());
        System.out.println("Nº de Veículos: "+queue.getSize());
        System.out.println("Total de solicitações de parada: "+requests);
        
    }
}