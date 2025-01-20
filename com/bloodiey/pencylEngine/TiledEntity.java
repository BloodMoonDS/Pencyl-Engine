package com.bloodiey.pencylEngine;

import com.bloodiey.GGL.Image;

public class TiledEntity extends Sprite {

	public TiledEntity(String objName, Image imges, Vector2 Pos, Vector2 Siz) {
		super(objName, imges, Pos, Siz);
		// TODO Auto-generated constructor stub
	}
	
	public void move(Vector2 moveAdd) {
		super.position.add(moveAdd.x, moveAdd.y);
	}

}
