package com.bloodiey.pencylEngine;

public class Vector2 {
	
	public float x;
	public float y;
	
	public Vector2(float posX, float posY) 
	{
		x = posX;
		y = posY;
	}
	
	public void add(float posX, float posY) 
	{
		x += posX;
		y += posY;
	}
	public void subtract(float posX, float posY) 
	{
		x -= posX;
		y -= posY;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
}
