package br.edu.ifrs.canoas.trabalhofinales.model;

public abstract class VehicleFactory {

	private double chanceCar;
	private double chanceBus;
	private double chanceTruck;
	
	public VehicleFactory(){
		this.chanceCar = 0.8;
		this.chanceBus = 0.12;
		this.chanceTruck = 0.08;
	}
	
	public VehicleFactory(double chanceCar, double chanceBus, double chanceTruck){
		
		if(chanceBus+chanceCar+chanceTruck > 1 || chanceCar == 0 || chanceBus == 0 || chanceTruck == 0){
			this.chanceCar = 0.8;
			this.chanceBus = 0.12;
			this.chanceTruck = 0.08;
			
		}
		else{
			this.chanceBus = chanceBus;
			this.chanceCar = chanceCar;
			this.chanceTruck = chanceTruck;
		}
	}
	
	public abstract Vehicle createVehicle();

	public double getChanceCar() {
		return chanceCar;
	}

	public double getChanceBus() {
		return chanceBus;
	}

	public double getChanceTruck() {
		return chanceTruck;
	}
	
	
}
