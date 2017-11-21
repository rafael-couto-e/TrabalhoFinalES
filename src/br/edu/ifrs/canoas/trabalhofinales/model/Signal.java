package br.edu.ifrs.canoas.trabalhofinales.model;

public abstract class Signal {
    public static final int STOP = 0;
    public static final int CAUTION = 1;
    public static final int GO = 2;
    protected boolean haltLine = false;
    protected int state = STOP;
    
    public void changeState(){
        switch(state){
            case GO:
                state = CAUTION;
                break;
            case CAUTION:
                state = STOP;
                break;
            case STOP:
                state = GO;
                break;
        }
    }
    
    public int getState(){
        return state;
    }
    
    public boolean getHaltLine(){
        return haltLine;
    }
    
    public void requestHaltLine(){
        haltLine = true;
        state = CAUTION;
    }
    
    public void haltGranted(){
        haltLine = false;
        state = GO;
    }
    
    public abstract String getMessage();
}