package br.edu.ifrs.canoas.trabalhofinales.model;

public abstract class Vehicle {
	
	protected double speed = 0;
	protected double maxSpeed;
	protected double lenght;
	
	public double getSpeed() {
		return speed;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public double getLenght() {
		return lenght;
	}
	
	public void accelerate(){
		
		speedControl();
		if(speed < maxSpeed){
			speed++;
		}
	}
	
	public void decelerate(){
		
		speedControl();
		if(speed > 0){
			speed--;
		}
	}
	
	protected void speedControl(){
		if(speed< 0){
			speed = 0;
		}
		else if(speed > maxSpeed){
			speed = maxSpeed;
		}
	}
	
	@Override
	public String toString(){
		return "Velocidade maxima: "+maxSpeed+"\n comprimento: "+lenght+"\n velocidade atual: "+speed;
	}
	
	
}
