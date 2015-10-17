package com.javalearnings;
//Polymorphism - taking many shapes 
//If you hv a child class then you can always use the child class wherever parent class could be used
//variable type determines which methods it can invoke - NOT the object reference it points to 

public class PolymorphismApp {

	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree   = new Tree();
		//Polymorphism
		//Plant plant2 = plant;
		Plant plant2  = tree;
		plant2.grow();
		tree.shedLeaves();
		//this will give error coz plant type variable does not know which method to call
		//variable type determines which methods it can invoke - NOT the object reference it points to 
		//plant2.shedleaves();
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
