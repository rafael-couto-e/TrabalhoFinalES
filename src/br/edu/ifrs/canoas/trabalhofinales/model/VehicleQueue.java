package br.edu.ifrs.canoas.trabalhofinales.model;

import java.util.ArrayList;
import java.util.List;

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
		
		double acm = 0;
		for(Vehicle v : theQueue){
			acm+= v.getLenght();
		}
		
		return acm;
	}
	
	public int getSize(){
		return theQueue.size();
	}
	
	public void enter(){
		
		Vehicle v = theFactory.createVehicle();
		theQueue.add(v);
	}
	
	public void leave(){
		if(getSize()> 0){
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
