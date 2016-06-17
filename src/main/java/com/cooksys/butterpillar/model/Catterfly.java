package com.cooksys.butterpillar.model;

public class Catterfly {
	private double wingspan;
	private double weight;

	// any instance fields should be private

	

	public double getWingspan() {
		return wingspan; // to be implemented
	}

	public void setWingspan(double wingspan) {
		// to be implemented
		this.wingspan = wingspan;
	}

	public double getWeight() {
		return weight; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		// TODO: to be implemented
		this.weight = weight;
	}
	
	public boolean equals(Catterfly c) {
		if(c.weight == this.weight && c.wingspan == this.wingspan){
			return true;
		}
		return false; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return "Catterfly [wingspan=" + wingspan + ", weight=" + weight + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
