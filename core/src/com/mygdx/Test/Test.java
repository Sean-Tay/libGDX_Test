package com.mygdx.Test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Test extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	BitmapFont font;
	
	//Hello World Msg
	final String HELLO_WORLD = "Hello World!";
	
	//Window is 640*480
    final float boundary_x = 640;
    final float boundary_y = 480;
    final float boundary_025x = (float) (0.25*boundary_x);
    final float boundary_075x = (float) (0.75*boundary_x); //From 160 to 480
    final float boundary_025y = (float) (0.25*boundary_y);
    final float boundary_075y = (float) (0.75*boundary_y); //From 120 to 360 
    
	@Override
	public void create () {
	    
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		font = new BitmapFont();
		font.setColor(Color.RED);
	}

	@Override
	public void render () {
	    
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		//Draw a message centralized to the screen.
		font.draw(batch, HELLO_WORLD, (boundary_x - font.getBounds(HELLO_WORLD).width)/2, boundary_y/2 + font.getCapHeight());
		
		batch.end();
	}
	
	public void dispose() {
	    
	    batch.dispose();
	    img.dispose();
	    font.dispose();
	    
	}
}
