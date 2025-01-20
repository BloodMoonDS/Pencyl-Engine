package com.bloodiey.pencylEngine;

import com.bloodiey.GGL.GameLoop;
import com.bloodiey.GGL.GenericRender;
import com.bloodiey.GGL.Image;

public class TiledSprite extends Object{

	public Image img = null;
	
	public Vector2 Size;
	
	public TiledSprite(String objName, Image imges, Vector2 Siz, Vector2 Pos) 
	{
		super(objName);
		Size = Siz;
		super.position = Pos;
		img = imges;
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
