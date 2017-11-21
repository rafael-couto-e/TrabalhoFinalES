package br.edu.ifrs.canoas.trabalhofinales.view;

import br.edu.ifrs.canoas.trabalhofinales.model.ConcreteTimeObserver;
import br.edu.ifrs.canoas.trabalhofinales.model.Time;

public class TrabalhoFinalES {
    public static final int DURATION = 600;
    
    static Time time = Time.getInstance();
    int counter;
    
    public static void main(String[] args) {
        time.addTimeObserver(new ConcreteTimeObserver());
        Time.init(DURATION);
    }
}