package br.edu.ifrs.canoas.trabalhofinales.model;

import java.util.Random;

public class ConcreteTimeObserver implements TimeObserver{
    public static final double STOP_CHANCE = 0.1;
    public static final double VEHICLE_CHANCE = 0.5;
    public static final int STOP_TIME = 20;
    public static final int GO_TIME = 30;
    
    @Override
    public void timeChanged(int newTime) {
        Random random = new Random();
        
        
    }
}