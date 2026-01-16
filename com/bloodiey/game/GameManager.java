package com.bloodiey.game;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import com.bloodiey.GGL.*;
import com.bloodiey.GGL.GameLoop;
import com.bloodiey.GGL.SoundClip;
import com.bloodiey.pencylEngine.Entity;
// import com.bloodiey.pencylEngine.Sprite;
import com.bloodiey.pencylEngine.Vector2;
import com.bloodiey.GGL.Image;
import com.bloodiey.GGL.GenericRender;

public class GameManager extends Abstract {
	
	public SoundClip mus_title;
	public Image exampleImg;
	public Entity example;
	public float spd = 64f;
	public static int resx = 320, resy = 240;
	public static float scale = 2f;
	public GameManager() 
	{
		mus_title = new SoundClip("/music/mus_lib.mid");
		exampleImg = new Image("/sprites/example/.png");
		example = new Entity("face", exampleImg, new Vector2((resx/2)-16,(resy/2)-16), new Vector2(64,64));
		
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
		// System.out.println("x: "+example.position.x+ " y: "+example.position.y);
	}

	@Override
	public void render(GameLoop gc, GenericRender r) {
		if(!mus_title.isRunning()) {
			mus_title.play();
		}
		
		r.clear(0xff000000);
		r.drawText("Use this as a library For Eclipse See documentation For more information", 0, 0, 0xffffffff);
		
		example.draw(gc, r);
		r.drawImage(exampleImg, 160-32, 120-32);
		//r.drawText("FPS: " + gc.getFps(), 0, 7, 0xffffffff);
		//r.drawText("Y: "+ example.getPosition().y, 0, 7+7, 0xff00ff00);
		//r.drawText("X: "+ example.getPosition().x, 0, 7+7+7, 0xfff0000);
		//r.drawDitheredSquare(0, 0, 32, 32, 0xffff00f0,false,true);
		//r.drawDitheredSquare(32,32, 32, 32, 0xffff00f0,false,true);
		//r.drawDitheredSquare(0, 0, 1024, 1024, 0xffffff00,true,true);
	}
	public static void main (String args[]) {
		int refreshRate = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getRefreshRate();
		//int resx = 480;
		//int rexy = 272;
		//float scale = 2f;
		GameLoop gc = new GameLoop(new GameManager());
		gc.setHeight(resy);
		gc.setWidth(resx);
		gc.setScale(scale);
		gc.setFRAMERATE(refreshRate);
		gc.start();
	}
	
}
