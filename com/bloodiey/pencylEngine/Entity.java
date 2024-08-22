package com.bloodiey.pencylEngine;

import com.bloodiey.GGL.Image;

public class Entity extends Sprite
{

	public Entity(String objName, Image imges, Vector2 Pos, Vector2 Siz) {
		super(objName, imges, Pos, Siz);
	}
	
	public void move(Vector2 moveAdd) {
		super.position.add(moveAdd.x, moveAdd.y);
	}
}
