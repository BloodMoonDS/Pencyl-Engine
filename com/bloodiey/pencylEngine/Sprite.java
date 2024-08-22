package com.bloodiey.pencylEngine;

import com.bloodiey.GGL.GameLoop;
import com.bloodiey.GGL.GenericRender;
import com.bloodiey.GGL.Image;

public class Sprite extends Object{
	
	public Image img = null;
	
	public Vector2 Size;
	
	public Sprite(String objName, Image imges, Vector2 Pos, Vector2 Siz) 
	{
		super(objName);
		Size = Siz;
		super.position = Pos;
		img = imges;
		// TODO Auto-generated constructor stub
	}
	public void draw(GameLoop gc, GenericRender gr) 
	{
		gr.drawImage(img, (int)super.position.x, (int)super.position.y);	
		
	}
	public void updateSprite() {
		
	}
	
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public Vector2 getSize() {
		return Size;
	}
	public void setSize(Vector2 size) {
		Size = size;
	}

}
