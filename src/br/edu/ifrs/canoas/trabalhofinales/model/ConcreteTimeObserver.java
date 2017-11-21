package br.edu.ifrs.canoas.trabalhofinales.model;

public class ConcreteTimeObserver implements TimeObserver{

    @Override
    public void timeChanged(int newTime) {
        System.out.println("Tempo atualizado: "+newTime);
    }
}