package com.cooksys.butterpillar.model;

public class GrowthModel {


	private double lengthToWingspan;
	private double leavesEatenToWeight;
	
	public GrowthModel(){
		
	}

	public double getLengthToWingspan() {
		return lengthToWingspan;
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight;
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		Catterfly c = new Catterfly();
		c.setWeight((butterpillar.getLeavesEaten() * this.leavesEatenToWeight));
		c.setWingspan((butterpillar.getLength() * this.lengthToWingspan));
		return c;
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		Butterpillar b = new Butterpillar();
		b.setLength((catterfly.getWingspan() / this.lengthToWingspan));
		b.setLeavesEaten((catterfly.getWeight() / this.leavesEatenToWeight));
		return b; 
	}
	
	public boolean equals(GrowthModel g) {
		if((g.lengthToWingspan == this.lengthToWingspan) && (g.leavesEatenToWeight == this.leavesEatenToWeight)){
			return true;
		}else
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + String.valueOf(this.lengthToWingspan) + ", " + (String.valueOf(this.leavesEatenToWeight)) + ")"; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
