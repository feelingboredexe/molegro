package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class molegro extends ApplicationAdapter {

	// le variable declarations
	SpriteBatch batch;
	private OrthographicCamera camera; // our funky little camera

	@Override
	public void create () {
		// instantiating camera
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 960); // just camera properties
		batch = new SpriteBatch();
		// import the textures here


	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		// batch rendering, opengl hates single sprites
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		// get rid of everything when game is closed
	}
}
