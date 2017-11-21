package br.edu.ifrs.canoas.trabalhofinales.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleQueue {
	
	private VehicleFactory theFactory;
	private double queueLenght;
	private double vehiclesPerSecond;
	private List<Vehicle> theQueue = new ArrayList<Vehicle>();
	
	public VehicleQueue(double vehiclesPerSecond, VehicleFactory vf){
		
		this.theFactory = vf;
		this.vehiclesPerSecond = vehiclesPerSecond;
	}
	
	public double getLenght(){
		
		return queueLenght;
	}
	
	public int getSize(){
		return theQueue.size();
	}
	
	public void enter(){  
		
		Random rand = new Random();
		double chance = rand.nextDouble();
		
		
		if(vehiclesPerSecond <= chance){
			Vehicle v = theFactory.createVehicle();
			theQueue.add(v);
			queueLenght +=v.getLenght();
		}
		
	}
	
	public void leave(){
		if(getSize()> 0){
			
			queueLenght -= theQueue.get(0).lenght;
			theQueue.remove(0);
		}	
	}
	
	public void list(){
		for(Vehicle v : theQueue){
			
			System.out.println(v);
			System.out.println("\n");
		}
	}
}
