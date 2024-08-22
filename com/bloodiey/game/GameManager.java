package com.bloodiey.game;

import java.awt.event.KeyEvent;
import com.bloodiey.GGL.*;
import com.bloodiey.GGL.GameLoop;
import com.bloodiey.GGL.SoundClip;
import com.bloodiey.pencylEngine.Entity;
import com.bloodiey.pencylEngine.Sprite;
import com.bloodiey.pencylEngine.Vector2;
import com.bloodiey.GGL.Image;
import com.bloodiey.GGL.GenericRender;

public class GameManager extends Abstract {
	
	public SoundClip mus_title;
	public Image exampleImg;
	public Entity example;
	public float spd = 16f;
	public GameManager() 
	{
		mus_title = new SoundClip("/music/mus_lib.mid");
		exampleImg = new Image("/sprites/example.png");
		example = new Entity("face", exampleImg, new Vector2(160-32,120-32), new Vector2(64,64));
		
	}
	
	@Override
	public void update(GameLoop gc, float dt) {
		
		if(gc.getInp().isKey(KeyEvent.VK_W)) 
		{
			example.position.y -= spd*dt;
			
		}
		if(gc.getInp().isKey(KeyEvent.VK_S)) 
		{
			
			example.position.y += spd*dt;
		}
		if(gc.getInp().isKey(KeyEvent.VK_A)) 
		{
			example.position.x -= spd*dt;
			
		}
		if(gc.getInp().isKey(KeyEvent.VK_D))
		{
			
			example.position.x += spd*dt;
		}
		System.out.println("x: "+example.position.x+ " y: "+example.position.y);
	}

	@Override
	public void render(GameLoop gc, GenericRender r) {
		if(!mus_title.isRunning()) {
			mus_title.play();
		}
		
		r.clear(0xff000000);
		r.drawText("Use this as a library For Eclipse See documentation For more information", 0, 0, 0xffffffff);
		//.drawImage(example, 160-32, 120-32);
		example.draw(gc, r);
		//r.drawText("FPS: " + gc.getFps(), 0, 0, 0xffffffff);
	}
	public static void main (String args[]) {
		GameLoop gc = new GameLoop(new GameManager());
		gc.start();
	}
	
}
