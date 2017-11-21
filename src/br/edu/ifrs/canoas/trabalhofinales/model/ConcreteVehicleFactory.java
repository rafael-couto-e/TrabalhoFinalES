package br.edu.ifrs.canoas.trabalhofinales.model;

import java.util.Random;

public class ConcreteVehicleFactory extends VehicleFactory{

	public ConcreteVehicleFactory(){
		super();
	}
	
	public ConcreteVehicleFactory(double chanceCar, double chanceBus, double chanceTruck){
		super(chanceCar, chanceBus, chanceTruck);
	}
	
	@Override
	public Vehicle createVehicle(){
		
		Random random = new Random();
		
		double chance = random.nextDouble();
		
		if(chance <= getChanceCar()){
			return new Car();
		}
		else if(chance <= getChanceCar()+getChanceBus()){
			return new Bus();
		}
		else{
			return new Truck();
		}
		
	}
}
