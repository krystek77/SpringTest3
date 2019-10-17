package com.wronakrystian.domain;


public class Car {
	private String mark;
	private String model;
	
	public Car() {
		this("No mark","No model");
	}
	
	
	public Car(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Car [mark=" + mark + ", model=" + model + "]";
	}
	
}
