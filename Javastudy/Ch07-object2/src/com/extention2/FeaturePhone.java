package com.extention2;

public class FeaturePhone extends Phone{
	private int pixel;
	
	public FeaturePhone(String number, String model, String color, int pixel){
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
	}

	public int getPixel() {
		return pixel;
	}
}
