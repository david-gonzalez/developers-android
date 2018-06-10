package com.brightcrowns.games.developers.libgdx;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class DevelopersGdxGame implements ApplicationListener
{
	Texture texture;
	SpriteBatch batch;

	@Override
	public void create()
	{
		texture = new Texture(Gdx.files.internal("brightcrowns-presents-400x400.png"));
		batch = new SpriteBatch();
	}

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		double texture_scale = 1.5;
		int tw = (int)(texture.getWidth()*texture_scale);
		int th = (int)(texture.getHeight()*texture_scale);
		
		int sw = Gdx.graphics.getWidth();
		int sh = Gdx.graphics.getHeight();
	
		int x = sw/2 - tw/2;
		int y = sh/2 - th/2;
		
		batch.draw(texture,x,y,tw,th);
		
	    batch.end();
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
