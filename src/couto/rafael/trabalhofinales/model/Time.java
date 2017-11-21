package couto.rafael.trabalhofinales.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private static int currentTime;
    private static int endOfTime;
    private static Time instance;
    private List<TimeObserver> observers;
    
    public Time(int endOfTime){
        Time.endOfTime = endOfTime;
        currentTime = 0;
        observers = new ArrayList<>();
    }
    
    public static Time getInstance(){
        if (instance == null)
            instance = new Time(0);
        
        return instance;
    }
    
    public static void init(int endOfTime){
        Time.endOfTime = endOfTime;
    }
    
    public void notifyObservers(){
        observers.forEach((observer) -> {
            observer.timeChanged(currentTime);
        });
    }
    
    public void run(){
        while(currentTime < endOfTime){
            currentTime++;
            
            notifyObservers();
        }            
    }
    
    public void addTimeObserver(TimeObserver observer){
        observers.add(observer);
    }
    
    public void removeTimeObserver(TimeObserver observer){
        observers.remove(observer);
    }
}