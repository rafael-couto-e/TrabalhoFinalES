package couto.rafael.trabalhofinales.model;

public abstract class Signal {
    public static final int STOP = 0;
    public static final int CAUTION = 1;
    public static final int GO = 2;
    public boolean haltLine = false;
    public int state = STOP;
    
    public void changeState(){
        state = GO;
        haltGranted();
        state = CAUTION;
        state = STOP;
    }
    
    public int getState(){
        return state;
    }
    
    public boolean getHaltLine(){
        return haltLine;
    }
    
    public void requestHaltLine(){
        haltLine = true;
    }
    
    public void haltGranted(){
        haltLine = false;
    }
    
    public abstract String getMessage();
}