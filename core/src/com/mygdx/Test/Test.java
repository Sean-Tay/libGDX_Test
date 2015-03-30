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
	
	//Constants
	static final String HELLO_WORLD = "Hello World!";
	
	//Window is 640*480
    static final int boundary_x = 640;
    static final int boundary_y = 480;
    static final int boundary_025x = 120;
    static final int boundary_075x = 360; //From 120 to 360
    static final int boundary_025y = 160;
    static final int boundary_075y = 480; //From 160 to 480

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
