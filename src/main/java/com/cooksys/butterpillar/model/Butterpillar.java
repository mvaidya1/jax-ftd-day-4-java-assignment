package com.cooksys.butterpillar.model;

public class Butterpillar {
	private double length;
	private double leavesEaten;

	// any instance fields should be private

	public double getLength() {
		return length; // TODO: to be implemented
	}

	public void setLength(double length) {
		// TODO: to be implemented
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten; // TODO: to be implemented
	}

	public void setLeavesEaten(double leavesEaten) {
		// TODO: to be implemented
		this.leavesEaten =leavesEaten;
	}
	
	public boolean equals(Butterpillar b) {
		if(b.leavesEaten == this.leavesEaten && b.length ==this.length){
			return true;
		}
		return false; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return "Butterpillar [length=" + length + ", leavesEaten=" + leavesEaten + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
