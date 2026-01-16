package com.bloodiey.GGL;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Image {
	private int W,h;
	private int[] p;
	private int[] defaultp = new int[256];
	public Image(String Path) {
		
		BufferedImage image = null;
		
		
		try {
		if(Image.class.getResourceAsStream(Path)==null) {
			JOptionPane.showMessageDialog(null,Path + " Leads To a Null image \n");
		}	
		else {
			image = ImageIO.read(Image.class.getResourceAsStream(Path));
		}
		} catch (IOException e) {
			SoundClip errsnd = new SoundClip("/sounds/snd_crash.wav");
			JOptionPane.showMessageDialog(null,Path + " Caused an error Advanced Details: \n" + e);
			System.out.println("Error While getting your Image");
			FileSaver sav = new FileSaver();
			sav.Writefile("Image Error", "Exception: " + e);
			e.printStackTrace();
			image = new BufferedImage(0xff00ffff,16,16);
			int i;
			for(i = 0; i == 256; i++ ) 
			{
				defaultp[i] = 0xff00ffff;
			}
			SampleModel sampleModel = null;
			DataBuffer db = null;
			sampleModel.setPixels(0, 0, 16, 16, defaultp, db);
			Point point = new Point();
			point.x = 16;
			point.y = 16;
			Raster rt;
			
			image.setData(Raster.createRaster(sampleModel, db, point));
			image.setRGB(0, 0, 16, 16,defaultp , 0, 0);
			
		}
		
		W = image.getWidth();
		h = image.getHeight();
		p = image.getRGB(0, 0, W, h, null, 0, W);
		
		image.flush();
	}
	public int getW() {
		return W;
	}
	public void setW(int w) {
		W = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int[] getP() {
		return p;
	}
	public void setP(int[] p) {
		this.p = p;
	}
	
	
}
