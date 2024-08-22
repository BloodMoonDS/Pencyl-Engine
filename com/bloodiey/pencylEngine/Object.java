package com.bloodiey.pencylEngine;

import com.bloodiey.GGL.Abstract;
import com.bloodiey.GGL.GameLoop;
import com.bloodiey.GGL.GenericRender;

public class Object extends Abstract {
	public String name;
	public Vector2 position;
	
	public Object(String objName) 
	{
		name = objName;
		
	}

	@Override
	public void update(GameLoop gc, float dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameLoop gc, GenericRender r) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}
	
	
	
}
